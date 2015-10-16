package com.j2.factory.pizzaaf;
public abstract class Pizza {
	public Dough dough;
	Cheese cheese;
	Potato potato;
	String name;
	
	public abstract void prepare();
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
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
	public String toString(){
		StringBuffer end = new StringBuffer();
		end.append(name + " (");
		if(potato !=null ) end.append(potato+ ", ");
		if(dough !=null ) end.append(dough+ ", ");
		if(cheese !=null ) end.append(cheese+ ")");
		return end.toString();
	}
}
