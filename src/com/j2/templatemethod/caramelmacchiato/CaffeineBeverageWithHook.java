package com.j2.templatemethod.caramelmacchiato;

public abstract class CaffeineBeverageWithHook{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
      addCondiments();
    }
  }
  public void boilWater(){
    System.out.println("Boiling Water~");
  }
  public abstract void brew();
  public void pourInCup(){
    System.out.println("Pouring into cup~");
  }
  public abstract void addCondiments();
  boolean customerWantsCondiments(){
    return true;
  }
}