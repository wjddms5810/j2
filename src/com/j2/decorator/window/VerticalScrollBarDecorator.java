package com.j2.decorator.window;
  
public class VerticalScrollBarDecorator extends WindowDecorator{
  public VerticalScrollBarDecorator (Window windowDecorated){
    super(windowDecorated);
  }
  public void draw(){
    super.draw();
    drawVerticalScrollBar();
  }
  public void drawVerticalScrollBar(){
    // Draw the vertical scrollbar
  }
  public String getDescription(){
    return super.getDescription() + ", including vertical scrollbars";
  }
}
  
                     