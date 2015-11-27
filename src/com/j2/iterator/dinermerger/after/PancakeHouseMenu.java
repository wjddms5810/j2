package com.j2.iterator.dinermerger.after;
import java.util.*;

public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;
  //static final int MAX_ITEMS=3;
  int numberOfItems=0;
  //MenuItem[] menuItems;
  public PancakeHouseMenu(){
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("연어 샐러드",
                "연어가 곁들어진 샐러드입니다.", false, 2.99);
        addItem("토마토 스파게티",
                "매운 칠리가 곁들어진 토마토소스의 스파게티 입니다.", true, 2.99);
        addItem("고르곤 졸라피자",
                "깊은 치즈맛을 내는 고르곤 졸라 피자 입니다.", true, 3.29);
  }
  public void addItem(String n, String d,boolean v, double p){
    //menuItems[numberOfItems] = menuItem;
    //numberOfItems = numberOfItems +1;
    MenuItem menuItem = new MenuItem(n, d, v, p);
    menuItems.add(menuItem);
  }
  //public MenuItem[] getMenuItems(){
  public ArrayList getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
}