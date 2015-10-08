package com.j2.decorator.window;
  
public class HorizontalScrollBarDecorator extends WindowDecorator{
  public HorizontalScrollBarDecorator (Window windowDecorated){
    super(windowDecorated);
  }
  public void draw(){
    super.draw();
    drawHorizontalScrollBar();
  }
  public void drawHorizontalScrollBar(){
    // Draw the vertical scrollbar
  }
  public String getDescription(){
    return super.getDescription() + ", including horizontal scrollbars";
  }
}