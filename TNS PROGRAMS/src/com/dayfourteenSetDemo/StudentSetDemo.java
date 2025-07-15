package com.dayfourteenSetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {

		Set<Student> set=new HashSet<Student>();
		set.add(new Student(101, "Saurabh ", 88.88));
		set.add(new Student(1012, "sam", 67.89));
		set.add(new Student(101, "Ram", 78.89));
		set.add(new Student(1012, "dk", 67.89));//duplicate
		set.add(new Student(1012, "darshan", 90.87));
		
		System.out.print(set);
	}

}