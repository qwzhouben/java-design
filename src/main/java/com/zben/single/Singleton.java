package com.zben.single;

/**
 * @Desc: 优点：延迟加载，适合单线程操作
 *        缺点：线程不安全，在多线程容易出现不同步的情况
 * @Author: zhouben
 * @Date:2019/7/3 9:27
 */
public class Singleton {
    //私有静态引用，防止被引用
    private static Singleton instance = null;
    //私有构造，防止被实例化
    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
