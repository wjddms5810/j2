package com.j2.factory.pizzaaf;

public class PotatoPizza extends Pizza{
	PizzaIngredientFactory ingredient;
	public PotatoPizza(PizzaIngredientFactory ingredient){
		this.ingredient = ingredient;
	}
	public void prepare(){
		System.out.println ("1.preparing" + name);
		dough = ingredient.createDough();
		potato = ingredient.createPotato();
		cheese = ingredient.createCheese();
	}
}
