package vip.alphax.aop;


import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.time.StopWatch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import vip.alphax.annotation.LogClass;
import vip.alphax.exception.BusinessException;
import vip.alphax.utils.AnnotationUtil;
import vip.alphax.utils.Result;
import vip.alphax.utils.ResultUtils;

import java.lang.reflect.Method;

/**
 * @auther ucmed xpeng
 * @create 2018/11/28
 * @describe 日志处理
 */
@Component
@Aspect
public class ExceptionAspect {

  @Pointcut("execution(* vip.alphax.modular.api.*.*(..))")//此处基于自身项目的路径做具体的设置
  public void pointCut(){}

  @Around("pointCut()")
  public Object handleControllerMethod(ProceedingJoinPoint pjp) {
    // 用 commons-lang 提供的 StopWatch 计时
    StopWatch clock =  new StopWatch();
    Object result = null;
    try {
      clock.start(); // 计时开始
      result = pjp.proceed();
      clock.stop(); // 计时结束
    } catch (Throwable e) {
      return handlerException(pjp, e);
    }finally {
      pointLogs(pjp,result,clock);
    }
    return result;
  }

  /**
   * @Author Alpha丶X
   * @Date 2018-12-19 10:57:18
   * @Description 日志打印
   */
  private void pointLogs(ProceedingJoinPoint pjp,Object result,StopWatch clock) {
    // 日志打印
    Class tmpClass = pjp.getTarget().getClass();
    Logger logger = LoggerFactory.getLogger(tmpClass.getName());
    try {
      if(tmpClass.isAnnotationPresent(LogClass.class)){
        Method loggerMethod = getLogsAnnotation(pjp);
        StringBuffer sb = new StringBuffer("\n");
        // 对于是支付方法的实现类，强制打印日志
        if (AnnotationUtil.isReqData(loggerMethod)){
          String reqData = getMethodNameAndArgs(pjp);
          sb.append(" Interface execution req:" +reqData + "\n");
        }
        if (AnnotationUtil.isResData(loggerMethod)){
          sb.append(" Interface execution res:" + JSON.toJSONString(result));
        }
        if (AnnotationUtil.isSpend(loggerMethod)){
          sb.append(" spend:[ " + clock.getTime() + " ms]");
        }
        logger.info(sb.toString());
      }
    }catch (Exception e){
      logger.error("日志打印错误",e);
    }
  }

  /**
   * @Author Alpha丶X
   * @Date 2018-12-19 10:48:31
   * @Description 获取类上的注解
   */
  private Method getLogsAnnotation(ProceedingJoinPoint pjp) throws NoSuchMethodException {
    String methodName=pjp.getSignature().getName();
    Class<?> classTarget=pjp.getTarget().getClass();
    Class<?>[] par=((MethodSignature) pjp.getSignature()).getParameterTypes();
    return classTarget.getMethod(methodName, par);
  }

  /**
   * 获取方法名和参数
   * @author lyl
   * @param joinPoint
   * @return
   */
  private String getMethodNameAndArgs(JoinPoint joinPoint){
    Object[] args = joinPoint.getArgs();
    StringBuffer sb = new StringBuffer();
    sb.append("(");
    sb.append(JSON.toJSONString(args));
    sb.append(")");
    return sb.toString();
  }

  private Result handlerException(ProceedingJoinPoint pjp, Throwable e)throws BusinessException {
    // 已知异常
    Class tmpClass = pjp.getTarget().getClass();
    Logger logger = LoggerFactory.getLogger(tmpClass);
    if (e instanceof BusinessException) {
      BusinessException businessException = (BusinessException) e;
      logger.info(pjp.getSignature() + " error " + e.getMessage());
      return ResultUtils.error(businessException.getCode(),businessException.getMessage());
    } else {
      logger.info(pjp.getSignature() + " error ", e);
      // 内部逻辑错误
      return ResultUtils.error(999,"内部逻辑错误");
    }
  }

}
