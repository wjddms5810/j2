package com.j2.decorator.sandwich;

public class BeefSandwich extends Sandwich{
  BeefSandwich(){
    description = "Beef Sandwich";
  }
  public float cost(){
    return 1.99f;
  }
}
    