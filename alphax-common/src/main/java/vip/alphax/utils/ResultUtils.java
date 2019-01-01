package vip.alphax.utils;

/**
 * Created by admin on 2018/11/27.
 * 返回结果工具类
 */
public class ResultUtils {

    /**
     * 成功返回
     * @param object
     * @param msg
     * @return
     */
    public static Result success(Object object,String msg){
        Result result = new Result();
        result.setCode(200);
        result.setMessage(msg);
        result.setData(object);
        return result;
    }

    public static Result success(Object object){
        return success(object,"请求接口成功");
    }

    public static Result success(){
        return success(null);
    }

    /**
     * 错误返回
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(null);
        return result;
    }
}
