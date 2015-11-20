package com.j2.templatemethod.duckcomparator;
import java.util.*;
public class Duck implements Comparator<Duck>{
  String name;
  int weight;
  public Duck(String name, int weight){
    this.name = name;
    this.weight = weight;
  }
  public String toString(){
    return name + " weight "+ weight;
  }
  
  public int compare(Duck duck1, Duck duck2){
  if(duck1.weight>duck2.weight)return 1;
  else if(duck1.weight<duck2.weight)return -1;
  else return 0;
  }
}
                                      