package com.my.test.annotation;

/**
 * @author:shawn
 * @date 2020/10/19 14:30
 */
public class TestReflect {
    @TestAnno
    public void sayHitodefault(String name){
        System.out.println("say hi to "+name);
    }
    @TestAnno(name = "niuniu")
    public void sayHitoniuniu(String name){
        System.out.println("say hi to "+name);
    }

    public static void main(String[] args) throws Exception {
        ReflectProcesser reflectProcesser = new ReflectProcesser();
        reflectProcesser.parseMethod(TestReflect.class);
    }
}
