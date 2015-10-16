package com.j2.factory.figure;

public abstract class Figure {
	String name;
	Color color;
	Instrument instrument;
	Material material;
	
	abstract void prepare();
	public String getName(){
		return name;
	}
	public void draw(){
		System.out.println("2.drawing "+ getName());
	}
	public void cut(){
		System.out.println("3.cutting "+ getName());
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		StringBuffer result = new StringBuffer();
		result.append(name + " (" + color + ", "+instrument+ ", "+material+ ")");
		return result.toString();
	}

}
