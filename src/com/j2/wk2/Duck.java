package com.j2.wk2;

public abstract class Duck(){}
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior
    public Duck(){}
    public swim(){
        System.out,println("All ducks swim!")
    }
    abstract void display();
    public void performQuack(){
      quackBehavior.quack();}
    public void performFly(){
      flyBehavior.fly();}
    public void setFlyBehavior(FlyBehavior fb){
      flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
      quackBehavior = qb;
    }
