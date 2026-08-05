package com.demo.thread;

public class Test extends Thread {
	public void run() 
	{
		System.out.println("thread");
	}

	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("main");
         t.start();
		
		

	}

}
