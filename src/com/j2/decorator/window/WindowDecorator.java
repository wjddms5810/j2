package com.j2.decorator.window;
  
public abstract class WindowDecorator implements Window{
  protected Window windowDecorated;
  public WindowDecorator(Window windowDecorated){
    this.windowDecorated = windowDecorated;
  }
  public void draw() {
        windowDecorated.draw(); 
    }
  public String getDescription(){
    return windowDecorated.getDescription();
  }
}
