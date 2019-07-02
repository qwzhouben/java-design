package com.zben.strategy;

/**
 * @Desc:策略模式在“大闸蟹”做菜中的应用。
 *
 * 分析：关于大闸蟹的做法有很多种，我们以清蒸大闸蟹和红烧大闸蟹两种方法为例，介绍策略模式的应用。
 * @Author: zhouben
 * @Date:2019/7/2 17:28
 */
public class StrategyMain {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen(new BraisedCrabs());
        kitchen.cookingMethod();
    }
}
