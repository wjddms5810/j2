package com.j2.decorator.sandwich;

public class BaconSandwich extends Sandwich{
  BaconSandwich(){
    description = "Bacon Sandwich";
  }
  public float cost(){
    return 1.79f;
  }
}