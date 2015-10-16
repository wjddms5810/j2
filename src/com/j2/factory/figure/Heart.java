package com.j2.factory.figure;

public class Heart extends Figure{
	FigureIngredient ingredient;
	public Heart(FigureIngredient ingredient){
		this.ingredient = ingredient;
	}
	public void prepare(){
		System.out.println("1.preparing " + name);
		color = ingredient.getColor();
		instrument = ingredient.getInstrument();
		material = ingredient.getMaterial();
	}
}
