package com.dayfourth;

import java.util.Scanner;

public class Constructordemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter customer name ");
		String CustomerName=sc.next();
		
		System.out.println("enter customer id  ");
		int CustomerId=sc.nextInt();
		
		System.out.println("enter customer city ");
		String CustomerCity=sc.next();
		
		System.out.println(" ");
		Customer c1 = new Customer();
		Customer c2=new Customer(CustomerName,CustomerId,CustomerCity);
		System.out.println(c2);
		
		
		
	}	
	

}
