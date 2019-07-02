package com.zben.proxy;

/**
 * @Desc:代理类
 * @Author: zhouben
 * @Date:2019/7/2 11:31
 */
public class Sgproxy implements Specialty {

    private WySpecialty realSubject=new WySpecialty();
    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("韶关代理婺源开始。。。");
    }
    public void postRequest() {
        System.out.println("韶关代理婺源结束。。。");
    }
}
