package com.j2.factory.pizzaaf;

public interface PizzaIngredientFactory {
	public abstract Dough createDough();
	public abstract Potato createPotato();
	public abstract Cheese createCheese();
}
