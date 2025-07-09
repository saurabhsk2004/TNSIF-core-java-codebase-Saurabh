package com.DayTenSingledimenArrray;

public class ArrauObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students[] arr;
		
		arr =new Students[5];
		
		
		arr[0]=new Student(101,"heti");
		arr[1]=new Student(102,"sathii");
		arr[2]=new Student(103,"sam");
		arr[3]=new Student(101,"heti");
		arr[4]=new Student(101,"heti");
		
		for (int i=0;i<arr;i++)
		{
			System.out.println(i);
			
		}
		

	}


