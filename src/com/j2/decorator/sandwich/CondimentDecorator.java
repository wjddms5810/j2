package com.j2.decorator.sandwich;

public abstract class CondimentDecorator extends Sandwich{
  Sandwich sandwich;
  public abstract String getDescription();
}
  