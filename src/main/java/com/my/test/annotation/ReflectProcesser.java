package com.my.test.annotation;

import java.lang.reflect.Method;

/**
 * @author:shawn
 * @date 2020/10/19 14:20
 */
public class ReflectProcesser {
    public void parseMethod(final Class<?> clazz) throws Exception {
        //通过构造方法获取对象
        Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Class[]{});
        //通过反射获取所有的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (final Method declaredMethod : declaredMethods) {
            final TestAnno annotations= declaredMethod.getAnnotation(TestAnno.class);
            if (annotations!=null){
                declaredMethod.invoke(obj,annotations.name());
            }
        }

    }
}
