package com.j2.factory.pizzaaf;

public class JEPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new ThinCrushDough();
	}
	public Potato createPotato(){
		return new SlicedPotato();
	}
	public Cheese createCheese(){
		return new Mozzaraella();
	}
}
