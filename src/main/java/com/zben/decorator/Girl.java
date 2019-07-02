package com.zben.decorator;

/**
 * @Desc: 具体装饰角色：少女
 * @Author: zhouben
 * @Date:2019/7/2 10:26
 */
public class Girl extends Changer {

    public Girl(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    private void setChanger() {
        ((Original)super.m).setImage("Morrigan2.jpg");
        System.out.println("Morrigan2");
    }
}

















