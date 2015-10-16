package com.j2.factory.pizzaaf;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String type) ;
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		System.out.println("--We making "+ pizza.getName()+ "--");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;	
	}
}
