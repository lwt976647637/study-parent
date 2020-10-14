package com.lwt.study.design.abstractFactory.order;

import com.lwt.study.design.abstractFactory.pizza.BJCheesePizza;
import com.lwt.study.design.abstractFactory.pizza.BJPepperPizza;
import com.lwt.study.design.abstractFactory.pizza.Pizza;

//这是工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}