package com.j2.factory.pizzaaf;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore store1 = new SMStylePizzaStore();
		Pizza pizza1 = store1.orderPizza("potato");
		System.out.println("I oredred "+ pizza1);
		
		PizzaStore store2 = new JEStylePizzaStore();
		Pizza pizza2 = store2.orderPizza("potato");
		System.out.println("You oredred "+ pizza2);

	}

}
