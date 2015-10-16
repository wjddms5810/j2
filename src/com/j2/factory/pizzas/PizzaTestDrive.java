package com.j2.factory.pizzas;

public class PizzaTestDrive {
	public static void main(String[] args){
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("potato");
		System.out.println("We ordered " + pizza.getName());
		
	}
}
