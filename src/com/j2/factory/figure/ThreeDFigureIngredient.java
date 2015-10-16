package com.j2.factory.figure;

public class ThreeDFigureIngredient implements FigureIngredient{
	public Color getColor(){
		return new Red();
	}
	public Instrument getInstrument(){
		return new Crayon();
	}
	public Material getMaterial(){
		return new Wood();
	}

}
