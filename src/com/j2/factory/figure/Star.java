package com.j2.factory.figure;

public class Star extends Figure{
	FigureIngredient ingredient;
	public Star(FigureIngredient ingredient){
		this.ingredient = ingredient;
	}
	public void prepare(){
		System.out.println("1.preparing " + name);
		color = ingredient.getColor();
		instrument = ingredient.getInstrument();
		material = ingredient.getMaterial();
	}
}
