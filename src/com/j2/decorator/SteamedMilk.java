package com.j2.decorator;

public class SteamedMilk extends CondimentDecorator{
  public SteamedMilk(Beverage beverage){
    this.beverage = beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ", SteamedMilk"; //decorate
  }
  public double cost(){
    return .20 + beverage.cost(); //decorate
  }
}