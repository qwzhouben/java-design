package com.zben.decorator;

/**
 * @Desc: 具体装饰角色：女妖
 * @Author: zhouben
 * @Date:2019/7/2 10:26
 */
public class Succubus extends Changer {

    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    private void setChanger() {
        ((Original)super.m).setImage("Morrigan1.jpg");
        System.out.println("Morrigan1");
    }
}

















