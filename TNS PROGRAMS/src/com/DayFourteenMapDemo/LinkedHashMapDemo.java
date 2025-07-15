package com.DayFourteenMapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap lht=new LinkedHashMap();
		lht.put(101, 1000);
		lht.put(1012, 23.34);
		lht.put(203, "Pune");
		lht.put(401, 10);
		lht.put(101, 3000);
		lht.put(102, 3000);
		
		
		System.out.println(lht);


	}

}
