package com.org.practiseprograme;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int f1,f2=0,f3=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the fibonacci serries=");
		int number=scan.nextInt();
			
		for(int i=0;i<=number;i++)
		{
			//System.out.println("fibonacci is ="+f3);
		
			f1=f2;
			f2=f3;
			System.out.println("fibonacci is ="+f3);
			f3=f1+f2;
			
		}	
	}
	}
