package com.dayfourhirachiinheritance;

public class HierarchicalDriver {

	public static void main(String[] args) {
	

		Person p1=new Person();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("-----");
		
		
		Person p;
		p=new Person("Saurabh", "pune");
		System.out.println("Person Details "+ p);
		
		p=new Student("kunal", "Nashik", "Second year ", 67.89f);
		System.out.println("Students details "+ p);
		
		p=new Employee("hanuman", "Nagar", 1002, 45, "Development");
		System.out.println("employee details "+ p);
		


		
	}

}
