package com.zben.strategy;

/**
 * @Desc: 具体策略类：清蒸大闸蟹
 * @Author: zhouben
 * @Date:2019/7/2 17:24
 */
public class SteamedCrabs implements CrabCooking {

    @Override
    public void cookingMethod() {
        System.out.println("清蒸大闸蟹");
    }
}
