package com.zben.observable;

import java.util.Observable;

/**
 * @Desc: 目标类：原油期货
 * @Author: zhouben
 * @Date:2019/7/3 10:23
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        //设置内部标志位，注明数据发生变化
        super.setChanged();
        //通知观察者价格变了
        super.notifyObservers(price);
        this.price = price;
    }
}





















