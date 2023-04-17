package javaSesions;

import java.util.Arrays;
import java.util.Collections;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		a=30;
		
		String s="Ram";
		String x="Ravi";
		System.out.println(x);//Ravi
		x="chandra";
		System.out.println(x);//chndra
		
		//Array is collection of similar type of elements
		//array is an object
		//We can store similar type of data elememnts
		//We can store only fixed set of elements
		
		//Valus will be store in array index basis 0 1 2 3 4 5 6 7 8 9....
		
		//Lowest index= 0
		//Higest index=length-1 (5-1=4)
		
		//1. Static array
		//2. Dynamic Array
		
		
		//1. Static array
		int i[]=new int[5];
		
		i[0]=100;
		i[1]=200;
		
		i[3]=400;
		i[4]=500;
		
		//i[5]=600;  ArrayIndexOutOfBondsException
		//i[-1]=450; ArrayIndexOutOfBondsException
		
		System.out.println(i[0]);//100
		
		System.out.println(i[4]);//500
		
		//System.out.println(i[5]);ArrayIndexOutOfBondsException
		
		//System.out.println(i[-1]);ArrayIndexOutOfBoundsException
		
		
		System.out.println("Always the lowest index is "+0);
		
		System.out.println(i.length);
		
		System.out.println("Always the higest index is "+(i.length-1));
		
		System.out.println(i[2]);// Default vaues
		
		//Deafult values for int, byte, short and long =0
		//Default value for float and double=0.0
		//Default value for Char = space ' '
		//Default value for boolean= false
		//String deafualt valie is "null"
		System.out.println("**********get all values from array using for loop***********");
				
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("----------------------");
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
		}
		System.out.println("************for each loop to get data in array*************");
		for(int e:i) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------");
		int z[]= {1,2,5,8};
		
		System.out.println(z.length);
		for(int j=0;j<z.length;j++) {
			System.out.println(z[j]);
		}
		System.out.println("***********double array***************");
		//double array
		double d[]= new double[2];
		d[0]=780.89;
		d[1]=455.65;
		
		for(int j=0;j<d.length;j++) {
			System.out.println(d[j]);
		}
		
		for(double e:d) {
			System.out.println(e);
		}
		System.out.println("***********char array***************");
		
		char c[]=new char[4];
		c[0]='1';
		c[1]='a';
		c[2]='A';
		c[3]='$';
		
		System.out.println("***********String array***************");
		
		String names[]= new String[5];
		names[0]="Phill";
		names[1]="Json";
		names[2]="Colin";
		names[3]="Sininja";
		
		for(int j=0;j<names.length;j++) {
			System.out.println(names[j]);
		}
		
		for(String e:names) {
			System.out.println(e);
		}
		
		//Limitations of an array
		//1. Size is fixed : Static array
		//2. we can store only similar type of data
		
		Object empdata[]= new Object[5];
		empdata[0]=10002;
		empdata[1]="Ranjith";
		empdata[2]=56000.89;
		empdata[3]='M';
		empdata[4]=true;
		
		for(int j=0;j<empdata.length;j++) {
			System.out.println(empdata[j]);
		}
		
		
		for(Object e:empdata) {
			System.out.println(e);
		}
		//Assignment
		Integer e[]= {1,7,8,9,0};
		
		Arrays.sort(e);
		
		for(Integer j:e) {
			System.out.println(j);
		}
		
		Arrays.sort(e,Collections.reverseOrder());
		
		//1. Add all vaus in array(sum of the array)
		//2. find even numbers in array
		//3. find odd numbers in array
	}

}
