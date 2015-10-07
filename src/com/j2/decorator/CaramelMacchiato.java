package com.j2.decorator;

public class CaramelMacchiato extends Beverage{
  public CaramelMacchiato(){
    description = "CaramelMacchiato Coffee";
  }
  public double cost(){
    return 1.09;
  }
}