package com.j2.command.simpleremote;

public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command command){
    slot  = command;
  }
  public void bottonWasPressed(){
    slot.execute();
  }
}
                                        