package com.j2.factory.figure;
public class FigureTestDrive {

	public static void main(String[] args) {
		FigureMaker figuremaker1= new TwoDFigureMaker();
		Figure figure1 = figuremaker1.orderFigure("heart");
		System.out.println ("JoungEun made a "+figure1);
		
		FigureMaker figuremaker2= new ThreeDFigureMaker();
		Figure figure2 = figuremaker2.orderFigure("star");
		System.out.println ("JoungEun made a "+figure2);
		
	}

}
