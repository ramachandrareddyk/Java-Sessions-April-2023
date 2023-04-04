package javaSesions;

public class DataTypes {

	public static void main(String[] args) {
		
		// 1. Primitive data type- We can use this without creating an onject
		// 2. Non Primitive data types -We have to create an object to use this data types
		
		//1. primitive datatypes
		
		//1. Integer family- We can store the numbers without Decimals and
		//we can store positive and negative values
		//byte
		//short
		//int
		//long
		
		//2. Floating family -We can store the decimal values
			//float
			//double
		//3. Chracters store only single chracters J, 6, $
			//char
		//4. boolean we can store true/false
		
		
		//2. Non Primitive data types
		//1. String- Store group of chracters/words
		//2. Array
		//3. Array list
		
		
		//1. Integer family- We can store the numbers without Decimals and
				//we can store positive and negative values
				//byte
				//short
				//int
				//long
		//a. byte
		byte b = 10;
		//Size= 1 byte= 8 bits
		//range=-128 to 127
		//byte- is the data type
		//b =is the variable name
		//= is assignment operater
		//10 is the value
		
		byte b1=127;
		byte b2=-128;
		//byte b1=12.9;
		
		b=25;
		
		//b. short
		 short s=1000;
		//Size= 2 byte= 16 bits
		//range=-32768 to 32767
		 short s1=-32768;
		 short s2=32767;
		 
		 //c. int
		 int i=100000;
		//Size= 4 byte= 32 bits
		//range=-2^31 to 2^32(-2147483648= 2147483647)
		 
		 int i1=10;
		 int i2=-1;
		 
		 //d. Long
		 long l=123456789;
		//Size= 8 byte= 64 bits
		//range=9;
		 
		 long l1=998877665;
		 
		//2. Floating family -We can store the decimal values
			//float
			//double
		 //float
		 float f=123.45f;
		//Size= 4 byte= 32 bits
		 //range= after decimal 7 digits
		 
		 float f1=(float)123.78;
		 System.out.println(f1);
		 
		 float f2=123f;
		 
		 //double
		 double d=234;//234.00
		 double d1=234.67;
		//Size= 8 byte= 64 bits
		 //range= after decimal 15 digits
		 
		 //Chracter
		 char c='d';
		 char c1='3';
		 char c2='$';
		 char c3=' ';
		//Size= 2 byte= 16 bits
		 
		// boolean
		 
		 boolean a=true;
		 boolean a1=false;
		 System.out.println(a1);
		 
		 //Non Primitive datat types
		 String str="Hello Testing";
		 int x=100;
		 int x1=200; //300
		 String str1="100";
		 String str2="200";//100200
		 System.out.println(str);
	}

}
