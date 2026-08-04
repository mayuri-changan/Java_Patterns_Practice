package com.demo.convert;
import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n======converter======\n");
		System.out.println("enter the km:");
		double km=sc.nextDouble();
		double meter=1000*km;
		System.out.println("================================================================");
		System.out.println("\n========convert:km into m is:=======\n"+meter);
		System.out.println("\nenter the meter \n");
		double m=sc.nextDouble();	
		double kmm=m/1000;
		System.out.println("\n=======convert m into km:=====\n"+kmm);
		

	}

}
