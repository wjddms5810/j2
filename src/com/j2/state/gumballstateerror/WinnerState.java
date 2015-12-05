package com.j2.state.gumballstateerror;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter(){
		System.out.println("Please wait, we're already giving you a gumball");
	}
	public void ejectQuarter(){
		System.out.println("Please wait, we're already giving you a gumball");
	}
	public void turnCrank(){
		System.out.println("Turning twice doesn't get you another gumball!");
	} 
	public void dispense(){
		System.out.println("you are winner! you get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()==0)
			gumballMachine.setState(gumballMachine.getSoldOutState());
		else 
			gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0)
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		else{
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	public String toString(){
		return "dispensing two gumballs for your quarter, because you are a winner";
	}
}
