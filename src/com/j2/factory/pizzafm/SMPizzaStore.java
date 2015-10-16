package com.j2.factory.pizzafm;


public class SMPizzaStore extends PizzaStore{
	Pizza pizza = null;
	public Pizza createPizza(String type){
		if(type.equals("potato")){
			pizza = new SMStylePotatoPizza();
		}
		return pizza;
	}
}
