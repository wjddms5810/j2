package com.j2.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
	String name,dough,sauce;
	ArrayList toppings = new ArrayList();
	public String getName(){
		return name;
	}
	public void prepare(){
		System.out.println("1.preparing " + name);
		System.out.println("  tossing duagh~");
		System.out.println("  adding sauce~");
		System.out.print("  adding topping ");
		for(int i=0; i < toppings.size();i++){
			System.out.println(toppings.get(i) + "~");
		}
	}
	public void bake(){
		System.out.println("2.baking " + name);
	}
	public void cut(){
		System.out.println("3.cutting " + name);
	}
	public void box(){
		System.out.println("4.boxing " + name);
	}
}
