package com.demo.arrays;
import java.util.Scanner;

public class My2DArray 
{
	private int [][] arr;
	
		public My2DArray() {
			arr =new int[3][3];
		}
		public My2DArray(int row,int col) {
			arr =new int[row][col];
		}
		public My2DArray(int[][]arr) {
			super();
			this.arr=arr;
		}
		public void acceptData()
		{
			Scanner sc=new Scanner(System.in);
			for (int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("enter row data"+i+"enter column data"+j);
					arr[i][j]=sc.nextInt();
				}
				
			}
			
		}
		public void displayData()
		{
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++) {
					System.out.println(arr[i][j]);
				}
			}
		}
}

