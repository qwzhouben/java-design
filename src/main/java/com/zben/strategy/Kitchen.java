package com.zben.strategy;

/**
 * @Desc: 环境类：厨房
 * @Author: zhouben
 * @Date:2019/7/2 17:25
 */
public class Kitchen {

    private CrabCooking strategy;   //抽象策略

    public Kitchen(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public void cookingMethod() {
        strategy.cookingMethod();
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }
}
