package com.j2.iterator.dinermerger.before;
import java.util.*;

public class PancakeHouseMenu{
  ArrayList menuItems;
  //static final int MAX_ITEMS=3;
  int numberOfItems=0;
  //MenuItem[] menuItems;
  public PancakeHouseMenu(){
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("채식 BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("그냥 BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("오늘의 스프",
                "Soup of the day, with a side of potato salad", false, 3.29);
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
}
