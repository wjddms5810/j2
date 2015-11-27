package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  MenuItem[] menuItems;
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("샐러드",
                "토마토 오이 파프리카 샐러드 입니다.", true, 2.99);
        addItem("스테이크",
                "등심 스테이크 입니다.", false, 2.99);
        addItem("오늘의 스프",
                "소고기 스프입니다.", false, 3.29);
  }
  public void addItem(String n, String d,boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    if(numberOfItems>=3){
      System.out.println("Sorry Full . .");
    }else{
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems +1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);
  }
}
