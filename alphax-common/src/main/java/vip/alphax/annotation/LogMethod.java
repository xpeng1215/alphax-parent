package vip.alphax.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther ucmed xpeng
 * @create 2018/5/3
 * @describe
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogMethod {
  boolean resData() default true;
  boolean reqData() default true;
  boolean spend() default true;
}

