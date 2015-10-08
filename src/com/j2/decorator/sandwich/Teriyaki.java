package com.j2.decorator.sandwich;

public class Teriyaki extends CondimentDecorator{
  Teriyaki(Sandwich sandwich){
    this.sandwich = sandwich;
  }
  public String getDescription(){
    return sandwich.getDescription() + ", Teriwaki";
  }
  public float cost(){
    return 0.10f + sandwich.cost();
  }
}
  