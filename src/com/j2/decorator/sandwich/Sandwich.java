package com.j2.decorator.sandwich;

public abstract class Sandwich{
  String description  = "unknown sandwich";
  public String getDescription(){
    return description;
  }
  public abstract float cost();
}
  