package com.j2.factory.pizzaaf;

public class SMStylePizzaStore extends PizzaStore{
	public Pizza createPizza(String type){
		PizzaIngredientFactory ingredient = new SMPizzaIngredientFactory();
		Pizza pizza = null;
		if(type.equals("potato")){
			pizza = new PotatoPizza(ingredient);
			pizza.setName("SM style Potato pizza");
		}
		return pizza;
	}
}
