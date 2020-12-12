package com.my.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author:shawn
 * @date 2020/10/19 15:28
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.PACKAGE,ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface NameScanner {
}
