package com.j2.iterator.dinermerger.after;
import java.util.*;

public class PancakeHouseMenuIterator implements Iterator{
  //MenuItem[] items;
  ArrayList items;
  int position = 0;
  //public DinerMenuIterator(MenuItem[] items){
  public PancakeHouseMenuIterator(ArrayList items){
    this.items = items;
  }
  public boolean hasNext(){
    //if(position >= items.length || items[position]== null){
    if(position >= items.size()){//사이즈가 늘어나므로 널을 넣을 필여가 없다.
      return false;
    }else{
      return true;
    }
  }
  public Object next(){
    //MenuItem menuItem = items[position];
    Object object = (Object)items.get(position);
    position+=1;
    //return menuItem;
    return object;
    }
}