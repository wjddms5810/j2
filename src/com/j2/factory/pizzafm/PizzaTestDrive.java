package com.j2.factory.pizzafm;

public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore smstore = new SMPizzaStore();
		Pizza pizza =  smstore.orderPizza("potato");
		System.out.println("We ordered " + pizza.getName());
	}

}
