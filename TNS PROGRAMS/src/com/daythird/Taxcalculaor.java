package com.daythird;


public class Taxcalculaor {

	
		
		private String name;
		private int income;
		private String gender;
		private int age;
		private long mobileno;
		private int tax;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getMobileno() {
			return mobileno;
		}
		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		@Override
		public String toString() {
			return "Taxcalculaor [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age
					+ ", mobileno=" + mobileno + ", tax=" + tax + "]";
		}
		

	}



