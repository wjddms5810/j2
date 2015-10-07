package com.j2.src.decorator.window;
  
public class DecorateWindowtest{
  public static void main(String[] args){
    Window decoratedWindow  = new SimpleWindow();
    decoratedWindow  = new VerticalScrollBarDecorator(decoratedWindow);
    decoratedWindow  = new HorizontalScrollBarDecorator(decoratedWindow);
    System.out.println(decoratedWindow.getDescription());
  }
}