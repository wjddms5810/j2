package com.j2.templatemethod.duckcomparator;
import java.util.*;

public class DuckSortTestDrive{
  public static void main(String args[]){
    List<Duck> ducks = new ArrayList<Duck>();
    ducks.add(new Duck("Daffy",8));
    ducks.add(new Duck("Dowey",5));
    ducks.add(new Duck("Howar",3));
    Collections.sort(ducks,new Duck(null,0));
    display(ducks);
    }
    public static void display(List ducks){
      for(int i=0; i<ducks.size();i++){
      System.out.println(ducks.get(i));
    }
  }
}
      