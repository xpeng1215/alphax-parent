package vip.alphax.utils;

import vip.alphax.annotation.LogMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @auther ucmed xpeng
 * @create 2018/5/3
 * @describe
 */
public class AnnotationUtil {

  public static boolean isReqData(Method method) {
    if (method.isAnnotationPresent(LogMethod.class)) {
      Annotation anot = method.getAnnotation(LogMethod.class);
      LogMethod log = (LogMethod) anot;
      if (log.reqData()) {
        return true;
      }
    }
    return false;
  }

  public static boolean isResData(Method method) {
    if (method.isAnnotationPresent(LogMethod.class)) {
      Annotation anot = method.getAnnotation(LogMethod.class);
      LogMethod log = (LogMethod) anot;
      if (log.resData()) {
        return true;
      }
    }
    return false;
  }

  public static boolean isSpend(Method method) {
    if (method.isAnnotationPresent(LogMethod.class)) {
      Annotation anot = method.getAnnotation(LogMethod.class);
      LogMethod log = (LogMethod) anot;
      if (log.spend()) {
        return true;
      }
    }
    return false;
  }


}
