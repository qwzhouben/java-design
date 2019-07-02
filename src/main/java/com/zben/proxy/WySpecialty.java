package com.zben.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @Desc: 真实主题
 * @Author: zhouben
 * @Date:2019/7/2 11:28
 */
public class WySpecialty extends JFrame implements Specialty {

    public WySpecialty() {
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1,1));
        JLabel l1=new JLabel(new ImageIcon("D:\\idea-project\\test\\java-design\\src\\main\\resources\\WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }
}
