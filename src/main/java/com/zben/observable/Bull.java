package com.zben.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @Desc: 具体观察者：多方
 * @Author: zhouben
 * @Date:2019/7/3 10:25
 */
public class Bull implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨"+price+"元，多方高兴了！");
        } else {
            System.out.println("油价下跌"+(-price)+"元，多方伤心了！");
        }
    }
}
