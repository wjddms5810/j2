package com.j2.factory.pizzaaf;

public class JEStylePizzaStore extends PizzaStore{
	public Pizza createPizza(String type){
		Pizza pizza = null;
		PizzaIngredientFactory ingredient= new JEPizzaIngredientFactory();
		if(type.equals("potato")){
			pizza = new PotatoPizza(ingredient);
			pizza.setName("JE Style Potato Pizza");
		}
		return pizza;
	}
}
