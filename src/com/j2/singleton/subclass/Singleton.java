package com.j2.singleton.subclass;

public class Singleton{
  protected volatile static Singleton uniqueInstance;
  private static int numCalled=0;
  protected Singleton() {}
  public static synchronized Singleton getInstance(){
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    System.out.println("numCalled: "+ numCalled++);
    return uniqueInstance;
  } 
}
