package com.zben.decorator;

/**
 * @Desc: 抽象装饰角色
 * @Author: zhouben
 * @Date:2019/7/2 10:24
 */
public class Changer implements Morrigan {

    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        m.display();
    }
}
