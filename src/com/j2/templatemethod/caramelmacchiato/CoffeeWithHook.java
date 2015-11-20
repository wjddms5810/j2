package com.j2.templatemethod.caramelmacchiato;
import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Dripping coffee~");
  }
  public void addCondiments(){
    System.out.println("Adding Caramel and Milk~");
  }
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){
      return true;
    }
    else {
      return false;
    }
  }
  private String getUserInput(){
    String answer = null;
    
    System.out.println("Would you like Caramel abd Milk with your coffee (y/n)?");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                                           
   try{
     answer = in.readLine();
   }catch(IOException ioe){
     System.out.println("IO error");
   }
   if(answer == null){
     return "no";
   }
   return answer;
   }
}
                                           