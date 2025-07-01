package com.daythird;

public class taxcalculatedemo {
	
	public void taxcalculaor(person person)
	{
	 if(person.getage()>65|| person.getgender().equalsIgnoreCase("female")) {
		 person.settax(0);
		 System.out.println("tax not applicable");
	 }
	 else {
		 if(person.getincome()<160000)
		 {
			 person.settax(0);
			 System.out.println("tax not applicable");
		 }
		 else if(person.getincome()>160000 && person.getincome<=500000)
		 {
			 person.settax(person.getincome()- 160000) +10/100);
		 }
		 else if(person.getincome()>500000 && person.getincome<=800000)
		 {
			 person.settax(person.getincome()- 500000) +10/100);
		 }
		 else 
		 {
			 person.settax(person.getincome()- 800000) +10/100 +94000);
		 }
	 }
	}

}
