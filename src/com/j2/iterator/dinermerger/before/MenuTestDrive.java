package com.j2.iterator.dinermerger.before;
import java.util.*;
public class MenuTestDrive{
  public static void main(String[]args){
    PancakeHouseMenu p = new PancakeHouseMenu();
    DinerMenu d = new DinerMenu();
    ArrayList pm = p.getMenuItems();
    for(int i = 0; i<pm.size(); i++){
       MenuItem menuItem = (MenuItem)pm.get(i);
       System.out.print(menuItem.getName());
       System.out.println("\t\t" + menuItem.getPrice());
       System.out.println("\t" + menuItem.getDescription());
    }
    MenuItem[] dm = d.getMenuItems();
    for(int i = 0; i<dm.length; i++){
       MenuItem menuItem = dm[i];
       System.out.print(menuItem.getName());
       System.out.println("\t\t" + menuItem.getPrice());
       System.out.println("\t" + menuItem.getDescription());
    }
  }
}
