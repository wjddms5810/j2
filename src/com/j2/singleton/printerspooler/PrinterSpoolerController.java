package com.j2.singleton.printerspooler;

public class PrinterSpoolerController {
	 public static void main(String args[]){
		    PrinterSpooler printer1 = PrinterSpooler.getInstance();
		    printer1.connect();
		    printer1.print();
		    printer1.disConnect();
		    PrinterSpooler printer2 = PrinterSpooler.getInstance();
		    printer2.connect();
		    printer2.print();
		    printer2.disConnect();
		  }
}