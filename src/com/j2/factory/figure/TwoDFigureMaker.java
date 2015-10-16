package com.j2.factory.figure;

public class TwoDFigureMaker extends FigureMaker{
	public Figure createFigure(String type){
		FigureIngredient ingredient = new TwoDFigureIngredient();
		Figure figure = null;
		if(type.equals("heart")){
			figure = new Heart(ingredient);
			figure.setName("2D Heart Figure");
		}
		else if(type.equals("star")){
			figure = new Star(ingredient);
			figure.setName("2D Star Figure");
		}
		return figure;
	}
}
