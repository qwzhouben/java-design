package com.zben.decorator;

import javax.swing.*;
import java.awt.*;

/**
 * @Desc: 具体构件角色
 * @Author: zhouben
 * @Date:2019/7/2 10:19
 */
public class Original extends JFrame implements Morrigan {
    private String t = "Morrigan0.jpg";
    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        /*this.setLayout(new FlowLayout());
        JLabel l1=new JLabel(new ImageIcon("com/zben/decorator/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);*/
        System.out.println("具体构件角色....Morrigan0.jpg");
    }
}
