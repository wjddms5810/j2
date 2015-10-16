package com.j2.factory.pizzaaf;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new VeryThickDough();
	}
	public Potato createPotato(){
		return new MashedPotato();
	}
	public Cheese createCheese(){
		return new Gorgonzola();
	}

}
