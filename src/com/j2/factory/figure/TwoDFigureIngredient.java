package com.j2.factory.figure;

public class TwoDFigureIngredient implements FigureIngredient{
	public Color getColor(){
		return new Blue();
	}
	public Instrument getInstrument(){
		return new Pen();
	}
	public Material getMaterial(){
		return new Paper();
	}
}
