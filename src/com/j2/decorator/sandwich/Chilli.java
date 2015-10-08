package com.j2.decorator.sandwich;

public class Chilli extends CondimentDecorator{
  Chilli(Sandwich sandwich){
    this.sandwich = sandwich;
  }
  public String getDescription(){
    return sandwich.getDescription() + ", Chilli";
  }
  public float cost(){
    return 0.10f+ sandwich.cost();
  }
}