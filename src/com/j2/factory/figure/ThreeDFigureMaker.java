package com.j2.factory.figure;

public class ThreeDFigureMaker extends FigureMaker{
	public Figure createFigure(String type){
		FigureIngredient ingredient = new ThreeDFigureIngredient();
		Figure figure = null;
		if(type.equals("heart")){
			figure = new Heart(ingredient);
			figure.setName("3D Heart Figure");
		}
		else if(type.equals("star")){
			figure = new Star(ingredient);
			figure.setName("3D Star Figure");
		}
		return figure;
	}

}
