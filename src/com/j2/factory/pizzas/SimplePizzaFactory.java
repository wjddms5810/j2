package com.j2.factory.pizzas;

public class SimplePizzaFactory {
	Pizza pizza = null;
	public Pizza createPizza(String type){
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}
		else if(type.equals("potato")){
			pizza = new PotatoPizza();
		}
		return pizza;
	}
}
