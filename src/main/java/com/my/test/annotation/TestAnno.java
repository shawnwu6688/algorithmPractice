package com.my.test.annotation;

import java.lang.annotation.*;

/**
 * @author:shawn
 * @date 2020/10/19 13:33
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TestAnno {
    String name() default "张三";
}
