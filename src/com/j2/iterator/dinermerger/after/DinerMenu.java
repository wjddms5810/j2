package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  MenuItem[] menuItems;
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("������",
                "�丶�� ���� ������ī ������ �Դϴ�.", true, 2.99);
        addItem("������ũ",
                "��� ������ũ �Դϴ�.", false, 2.99);
        addItem("������ ����",
                "�Ұ�� �����Դϴ�.", false, 3.29);
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
