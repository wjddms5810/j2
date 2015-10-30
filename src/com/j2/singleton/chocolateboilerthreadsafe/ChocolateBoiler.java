package com.j2.singleton.chocolateboilerthreadsafe;

public class ChocolateBoiler{
	  private boolean empty;
	  private boolean boiled;
	  private static ChocolateBoiler uniqueInstance;
	  private static int numCalled;
	  private ChocolateBoiler() {
		  empty = true;
		  boiled = false;
	  }
	  public static synchronized ChocolateBoiler getInstance(){
	    if(uniqueInstance == null){
	      System.out.println("Creating a new instance of Chocolate Boiler...");
	      uniqueInstance = new ChocolateBoiler();
	    }
	    System.out.println("Returning instance of Chocolate Boiler");
	    System.out.println("numCalled: "+ numCalled++);
	    return uniqueInstance;
	  }
	  public void fill(){
	    if(isEmpty()){
	      empty = false;
	      boiled = false;
	    }
	  }
	  public void drain(){
		  if(!isEmpty() && isBoiled()){
			  empty = true;
		  }
	  }
	  public void boil(){
		  if(!isEmpty()&&!isBoiled()){
			  boiled = true;
		  }
	  }
	  public boolean isEmpty(){
	    return empty;
	  }
	  public boolean isBoiled(){
		  return boiled;
	  }
	}
