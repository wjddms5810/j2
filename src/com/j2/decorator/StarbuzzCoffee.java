package com.j2.decorator;

public class StarbuzzCoffee{
  public static void main(String args[]){
    Beverage beverage1 = new DarkRoast();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + ", $" + beverage1.cost());
    
    Beverage beverage2 = new HouseBlend();
    beverage2 = new Soy(beverage2);
    beverage2 = new Soy(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());
    
    Beverage beverage3 = new CaramelMacchiato();
    beverage3 = new SteamedMilk(beverage3);
    beverage3 = new Whip(beverage3);
    beverage3 = new Caramel(beverage3);
    System.out.println(beverage3.getDescription() + ", $" + beverage3.cost());
    
  }
}
                                    
    