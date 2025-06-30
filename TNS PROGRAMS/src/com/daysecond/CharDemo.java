package com.daysecond;

public class CharDemo {
	public static void main(String[] args) {
		
		char ch=65;
				System.out.println(ch);
				
		//1 byte =8 bit //2^8
				//256 range -128 to +127
				
				byte bytemax=120;
				byte bytemin=-126;
				System.out.println("min range of byte:"+bytemin);
				
				
				
	//short ==2 byte =16 bit 2^16			
				short shortmin=-32768;
				short shotmax=32767;
				
				//int =4 byte 32 bit 2^#2
int maxint=2147483647;
//int maxint=-2147483648;

// long 8 byte-= 64 bit 2^64
//long maxkong=9123372036854775807;
//long minlong=-9223372036854775808;


//type casting 
//whitening- implicit tyoe casting
//narrowing- explicit tyoe casting
	

byte b=10;
int i=b;
System.out.println(i);//whitening implicit casting


double f1=10.52f;
long l1=(long)f1;
System.out.println(l1);//narrowing explicit casting









				}

}
