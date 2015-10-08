package com.j2.decorator.sandwich;

public class Egg extends CondimentDecorator{
  Egg(Sandwich sandwich){
    this.sandwich = sandwich;
  }
  public String getDescription(){
    return sandwich.getDescription() + ", Egg";
  }
  public float cost(){
    return 0.15f + sandwich.cost();
  }
}