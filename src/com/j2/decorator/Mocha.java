package com.j2.decorator;

public class Mocha extends CondimentDecorator{
  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ", Mocha"; //decorate
  }
  public double cost(){
    return .20 + beverage.cost(); //decorate
  }
}