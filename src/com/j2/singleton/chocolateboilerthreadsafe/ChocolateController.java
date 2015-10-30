package com.j2.singleton.chocolateboilerthreadsafe;

public class ChocolateController{
	  public static void main(String args[]){
	    ChocolateBoiler boiler = ChocolateBoiler.getInstance();//static 함수이여서 이렇게 부를 수 있음
	    boiler.fill();
	    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	    boiler2.fill();
	  }
	}