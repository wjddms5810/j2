package com.j2.decorator.sandwich;

public class Veggie extends CondimentDecorator{
  Veggie(Sandwich sandwich){
    this.sandwich = sandwich;
  }
  public String getDescription(){
    return sandwich.getDescription() + ", Veggie";
  }
  public float cost(){
    return 0.30f + sandwich.cost();
  }
}