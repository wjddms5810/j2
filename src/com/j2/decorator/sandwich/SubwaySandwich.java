package com.j2.decorator.sandwich;

public class SubwaySandwich{
  public static void main(String srgs[]){
    Sandwich sandwich1 = new BeefSandwich();
    sandwich1 = new Teriyaki(sandwich1);
    sandwich1 = new Veggie(sandwich1);
    System.out.println( sandwich1.getDescription() + " $" + sandwich1.cost());
    
    Sandwich sandwich2 = new ChickenSandwich();
    sandwich2 = new Cheese(sandwich2);
    sandwich2 = new Veggie(sandwich2);
    sandwich2 = new Chilli(sandwich2);
    System.out.println( sandwich2.getDescription() + " $" + sandwich2.cost());
    
    Sandwich sandwich3 = new BaconSandwich();
    sandwich3 = new Teriyaki(sandwich1);
    sandwich3 = new Veggie(sandwich1);
    sandwich3 = new Egg(sandwich1);
    System.out.println( sandwich3.getDescription() + " $" + sandwich3.cost());
    
    Sandwich sandwich4 = new SeaFoodSandwich();
    sandwich4 = new Chilli(sandwich4);;
    System.out.println( sandwich4.getDescription() + " $" + sandwich4.cost());
  }
}