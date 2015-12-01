package com.j2.state.gumball;

public class GumballMachine{
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;
  int state = SOLD_OUT;
  int count= 0;
  public GumballMachine(int count){
    this.count = count;
    if(count > 0){
      state = NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if(state==HAS_QUARTER)
      System.out.println("You can not insert another quarter");
    else if(state == NO_QUARTER)
      System.out.println("You inserted a quarter");
    else if(state == SOLD_OUT)
      System.out.println("You can not insert another quarter. Sold Out");
    else if(state == SOLD)
      System.out.println("wait");
  }
}

  