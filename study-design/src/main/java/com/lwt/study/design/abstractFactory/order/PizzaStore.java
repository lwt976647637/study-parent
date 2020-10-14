package com.lwt.study.design.abstractFactory.order;

public class PizzaStore {
	public static void main(String[] args) {
		new OrderPizza(new BJFactory());
	}
}