package com.j2.iterator.dinermerger.after;

public class MenuTestDrive{
  public static void main(String[] args){
    PancakeHouseMenu pm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(pm,dm);
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<모든메뉴>>>>>>>>>>>>>>>>>>>>>>");
    w.printMenu();
    System.out.println("<<<<<<<<<<<<<<<<<<<<채식 주의자 메뉴>>>>>>>>>>>>>>>>>>>>");
    w.printVMenu();
    
  }
}
    