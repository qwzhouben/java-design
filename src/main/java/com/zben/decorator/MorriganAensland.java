package com.zben.decorator;

/**
 * @Desc:装饰模式：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，
 * 它属于对象结构型模式
 * @Author: zhouben
 * @Date:2019/7/2 10:31
 */
public class MorriganAensland {
    public static void main(String[] args) {
        Morrigan m0 = new Original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
