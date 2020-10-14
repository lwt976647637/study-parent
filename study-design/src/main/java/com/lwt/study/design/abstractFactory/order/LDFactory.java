package com.lwt.study.design.abstractFactory.order;

import com.lwt.study.design.abstractFactory.pizza.LDCheesePizza;
import com.lwt.study.design.abstractFactory.pizza.LDPepperPizza;
import com.lwt.study.design.abstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}