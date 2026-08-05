package com.demo.thread;

public class Run implements Runnable {
	
	  public void run() {
		  System.out.println("Runnable"); 
	  }
	 
   
	public static void main(String[] args) {
		
Run t=new Run();
Thread th=new Thread(t);
th.start();
	}

}
