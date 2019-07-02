package com.zben.strategy;

/**
 * @Desc: 具体策略类：红烧大闸蟹
 * @Author: zhouben
 * @Date:2019/7/2 17:24
 */
public class BraisedCrabs implements CrabCooking {

    @Override
    public void cookingMethod() {
        System.out.println("红烧大闸蟹");
    }
}
