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
    if(position >= items.size()){//����� �þ�Ƿ� ���� ���� �ʿ��� ����.
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