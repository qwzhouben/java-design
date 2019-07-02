package com.zben.cloneable;

/**
 * @Desc:原型模式：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
 * @Author: zhouben
 * @Date:2019/7/2 14:14
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        obj1.display();
        Citation obj2 = (Citation)obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
