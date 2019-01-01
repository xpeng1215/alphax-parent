package vip.alphax.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther Alpha丶X
 * @create 2018年12月26日 09:19
 * @describe 时间格式处理
 */
public class DateUtils {

  public static final String YCHAR_01 = "MM-dd";

  public static final String YCHAR_02 = "HH:mm";

  public static final String YCHAR_03 = "HH:mm:ss";

  public static final String YCHAR_04 = "yyyy-MM-dd";

  public static final String YCHAR_05 = "yyyy/MM/dd";

  public static final String YCHAR_06 = "yyyy-MM-dd HH:mm:ss";

  public static final String YCHAR_07 = "yyyy-MM-dd'T'HH:mm:ss";

  public static final String YCHAR_08 = "yyyy-MM-dd HH:mm:ss:SSS";

  public static final String NCHAR_01 = "MMdd";

  public static final String NCHAR_02 = "HHmm";

  public static final String NCHAR_03 = "HHmmss";

  public static final String NCHAR_04 = "yyyyMMdd";

  public static final String NCHAR_05 = "yyyyMMddHHmmss";

  public static final String NCHAR_06 = "yyyyMMdd'T'HHmmss";

  public static final String NCHAR_07 = "yyyyMMddHHmmssSSS";

  private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>();

  public static DateFormat getDateFormat(String dateFormat)
  {
    DateFormat df = threadLocal.get();
    if(df==null){
      df = new SimpleDateFormat(dateFormat);
      threadLocal.set(df);
    }
    return df;
  }

  /**
   * date类型转String类型
   * @param date
   * @param dateFormat
   * @return
   */
  public static String format(Date date,String dateFormat){
    return getDateFormat(dateFormat).format(date);
  }

  /**
   * String类型转date类型
   * @param dateStr
   * @param dateFormat
   * @return
   * @throws ParseException
   */
  public static Date parse(String dateStr,String dateFormat) throws ParseException {
    return getDateFormat(dateFormat).parse(dateStr);
  }

  /**
   *
   * @param dateStr
   * @param beforeFormat
   * @param afterFormat
   * @return
   * @throws ParseException
   */
  public static String strFormat(String dateStr,String beforeFormat,String afterFormat) {
    try {
      Date date = parse(dateStr,beforeFormat);
      return format(date,afterFormat);
    }catch (Exception e){
    }
    return dateStr;
  }

  /**
   * @Author Alpha丶X
   * @Date 2018-12-26 18:15:46
   * @Description 获取今天，用于路径拼接
   */
  public static String getToday(){
    return format(new Date(),DateUtils.NCHAR_04);
  }

}
