package com.zben.single;

/**
 * @Desc: 双重检查单例模式
 *        优点：延迟加载，线程安全
 *        缺点：写法复杂， 不简洁
 * @Author: zhouben
 * @Date:2019/7/3 9:31
 */
public class SingletonDouble {

    private static SingletonDouble instance = null;

    private SingletonDouble() {
    }

    public static SingletonDouble getInstance() {
        SingletonDouble temp = instance;
        if (temp == null) {
            synchronized (SingletonDouble.class) {
                temp = instance;
                if (temp == null) {
                    temp = new SingletonDouble();
                    instance = temp;
                }
            }
        }
        return temp;
    }
}
