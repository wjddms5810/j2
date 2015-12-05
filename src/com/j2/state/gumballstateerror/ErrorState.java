package com.j2.state.gumballstateerror;

public class ErrorState implements State{
	GumballMachine gumballMachine;
	
	public ErrorState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter(){
		System.out.println("You can't insert quarter, the machine has a error");
	}
	public void ejectQuarter(){
		System.out.println("You can't eject, the machine has a error");
	}
	public void turnCrank(){
		System.out.println("You turned, but the machine has a error");
	} 
	public void dispense(){
		System.out.println("Sorry...the machine has a error");
	}
	public String toString(){
		return "Error";
	}
}