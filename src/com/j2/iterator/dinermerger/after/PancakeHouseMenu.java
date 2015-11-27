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
    addItem("���� ������",
                "��� ������ �������Դϴ�.", false, 2.99);
        addItem("�丶�� ���İ�Ƽ",
                "�ſ� ĥ���� ������ �丶��ҽ��� ���İ�Ƽ �Դϴ�.", true, 2.99);
        addItem("���� ��������",
                "���� ġ����� ���� ���� ���� ���� �Դϴ�.", true, 3.29);
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