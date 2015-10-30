package com.j2.singleton.printerspooler;

public class PrinterSpooler{
	  private volatile static PrinterSpooler uniqueInstance;
	  private boolean empty;
	  private boolean printed;
	  private static int numCalled=0;
	  private PrinterSpooler() {
		  empty = true;
		  printed = false;
	  }
	  public static synchronized PrinterSpooler getInstance(){
	    if(uniqueInstance == null){
	    	synchronized(PrinterSpooler.class){
	    		if(uniqueInstance == null){
	    			 System.out.println("Creating a new instance of Printer...");
	    			uniqueInstance = new PrinterSpooler();
	    		}
	    	}
	    }
	    System.out.println("Returning instance of Printer");
	    System.out.println("numCalled: "+ numCalled++);
	    return uniqueInstance;
	  }
	  public void connect(){
	    if(isEmpty()){
	      empty = false;
	      printed = false;
	    }
	    System.out.println("->Connecting a printer");
	  }
	  public void disConnect(){
		  if(!isEmpty() && isPrinted()){
			  empty = true;
		  }
		  System.out.println("->Disconnecting a printer");
	  }
	  public void print(){
		  if(!isEmpty()&&!isPrinted()){
			  printed = true;
		  }
		  System.out.println("->Printing");
	  }
	  public boolean isEmpty(){
	    return empty;
	  }
	  public boolean isPrinted(){
		  return printed;
	  }
	}

