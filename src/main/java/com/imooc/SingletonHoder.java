package com.imooc;

/**
 * 单利模式-饿汉式
 * 静态内部类
 */
public class SingletonHoder {
    private static class Holder{
        private static SingletonHoder singletonHoder = new SingletonHoder();
    }
    private SingletonHoder(){};

    public static SingletonHoder getInstance(){
        return Holder.singletonHoder;
    }
}
