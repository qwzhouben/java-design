package com.zben.single;

/**
 * @Desc: 饿汉式
 *        优点：延迟加载，线程安全（java中类加载时互斥的），减少了内存消耗，推荐使用内部类方式
 * @Author: zhouben
 * @Date:2019/7/3 9:36
 */
public class SingletonHg {

    //内部类实现单例，延迟健在，减少内存开销
    private static class SingletonHolder {
        private static SingletonHg instance = new SingletonHg();
    }

    private SingletonHg() {
    }

    public static SingletonHg getInstance() {
        return SingletonHolder.instance;
    }
}
