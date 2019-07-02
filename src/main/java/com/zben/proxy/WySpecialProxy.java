package com.zben.proxy;

/**
 * @Desc:代理模式：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。
 * 这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 * @Author: zhouben
 * @Date:2019/7/2 11:36
 */
public class WySpecialProxy {
    public static void main(String[] args) {
        Sgproxy sgproxy = new Sgproxy();
        sgproxy.display();
    }
}
