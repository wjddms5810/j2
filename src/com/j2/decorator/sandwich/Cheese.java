package com.j2.decorator.sandwich;

public class Cheese extends CondimentDecorator{
  Cheese(Sandwich sandwich){
    this.sandwich = sandwich;
  }
  public String getDescription(){
    return sandwich.getDescription() + ", Cheese ";
  }
  public float cost(){
    return sandwich.cost() + 0.2f;
  }
}