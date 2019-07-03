package com.zben.observable;

import java.util.Observer;

/**
 * @Desc:
 * @Author: zhouben
 * @Date:2019/7/3 10:28
 */
public class CrudeOilFutures {

    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear();   //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}

