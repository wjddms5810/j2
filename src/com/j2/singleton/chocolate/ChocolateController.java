package com.j2.singleton.chocolate;

public class ChocolateController{
  public static void main(String args[]){
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();//static �Լ��̿��� �̷��� �θ� �� ����
    boiler.fill();
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();//static �Լ��̿��� �̷��� �θ� �� ����
    boiler2.fill();
  }
}