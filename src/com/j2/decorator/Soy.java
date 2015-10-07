package com.j2.decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
    this.beverage = beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ", Soy"; //decorate
  }
  public double cost(){
    return .15 + beverage.cost(); //decorate
  }
}