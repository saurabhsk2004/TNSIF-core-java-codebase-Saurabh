package com.DayTenSingledimenArrray;

public class Students {

		private int rollNo;
		private String name;
		
		
		public Students (int rollNo, String name) {
			rollNo=12;
			name="sk";
			
		}


		public Students(int rollNo, String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
		}


		public int getRollNo() {
			return rollNo;
		}


		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		@Override
		public String toString() {
			return "Students [rollNo=" + rollNo + ", name=" + name + "]";
		}
		
		
		
}
