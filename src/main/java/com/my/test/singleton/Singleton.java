package com.my.test.singleton;

public class Singleton {
    /**
     * 单例创建的两种方式
     * 饿汉
     * 在类加载时就创立一个不可变的对象实例
     */
    //饿汉
    private static final Singleton SINGLETON = new Singleton();
    private Singleton(){}
    public static Singleton getHungryInstance() {

        return SINGLETON;
    }
    //懒汉

    private  static volatile Singleton singleton;
    public static  Singleton getLazyInstance(){
        /**
         * 如果没有实例化对象则加锁创建，如果已实例化对象，则直接创建
         * 这样就规避了两个线程同时实例化对象时出现的多例的问题
         * 也解决了因为解决多例问题加锁所导致的性能问题
         */
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
