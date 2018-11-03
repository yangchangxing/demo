package com.imooc;

/**
 * 单例模式-懒汉式
 * 线程安全/效率
 */
public class Singleton {
    private static volatile Singleton singleton = null;
    private Singleton(){

    };

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    };

}
