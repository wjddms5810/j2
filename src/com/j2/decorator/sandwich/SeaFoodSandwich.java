package com.j2.decorator.sandwich;

public class SeaFoodSandwich extends Sandwich{
  SeaFoodSandwich(){
    description = "SeaFood Sandwich";
  }
  public float cost(){
    return 2.09f;
  }
}