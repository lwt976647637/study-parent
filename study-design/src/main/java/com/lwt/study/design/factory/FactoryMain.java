package com.lwt.study.design.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product p = f.create("张三");
        p.use();
        System.out.println("--------------------");
        p = f.create("李四");
        p.use();
        System.out.println("--------------------");
        f.getAllProductOwner();
    }
}