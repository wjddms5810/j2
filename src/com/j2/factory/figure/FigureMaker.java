package com.j2.factory.figure;

public abstract class FigureMaker {
	public abstract Figure createFigure(String type);
	public Figure orderFigure(String type){
		Figure figure = createFigure(type);
		System.out.println("--Making a "+ figure.getName());
		figure.prepare();
		figure.draw();
		figure.cut();
		return figure;
	}
}
