package com.Association;

public class Executror {
public static void main (String[] args) {
		
		Address address= new Address("405 Laxmi nagar", "Pune", "Maharastra", "904904");
		
		Person p = new Person("saurabh", address);
		p.displayInfo();
		System.out.println(p);
}
}
