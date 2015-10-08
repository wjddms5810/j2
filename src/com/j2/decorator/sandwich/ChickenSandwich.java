package com.j2.decorator.sandwich;

public class ChickenSandwich extends Sandwich{
  ChickenSandwich(){
    description = "Chicken Sandwich";
  }
  public float cost(){
    return 1.69f;
  }
}