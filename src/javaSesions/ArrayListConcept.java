package javaSesions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array list is the default class in java
		//Arraylist is the dynamic array
		//Values will stored on index basis
		//to get the lengh size();
		//to get values from arraylist use get();
		//to remove value into arraylist user remove();
		
		
	ArrayList ar = new ArrayList();
	
	System.out.println(ar.size());
	
	ar.add(100);//0
	ar.add(300);//1
	ar.add("Test");///2

	System.out.println(ar.size());//3
	
	ar.add(500);//3
	ar.add("java");//4
	
	System.out.println(ar.size());//5
	
	System.out.println(ar.get(2));
	
	ar.remove(3);
	
	System.out.println(ar.get(3));//java
	
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	System.out.println("---------------------");
	for(Object e:ar) {
		System.out.println(e);
	}
	System.out.println("---------------------");
	
	ArrayList<Integer>numbers= new ArrayList<Integer>();
	numbers.add(400);
	numbers.add(600);
	numbers.add(399);
	for(Integer e:numbers) {
		System.out.println(e);
	}
	System.out.println("---------------------");
	ArrayList<String>names= new ArrayList<String>();
	names.add("Tom");
	names.add("Peter");
	names.add("Nelson");
	names.add("Sinija");
	
	for(String e: names) {
		System.out.println(e);
	}
	System.out.println("---------------------");
	ArrayList<Object>empData= new ArrayList<Object>();
	
	empData.add("Mani");
	empData.add(10004);
	empData.add(45678.98);
	empData.add('M');
	empData.add(true);
	
	for(Object e:empData) {
		System.out.println(e);
	}
	System.out.println("---------------------");
	ArrayList<Integer>num=new ArrayList<Integer>();
	
	num.add(567);
	num.add(654);
	num.add(241);
	num.add(453);
	
	Collections.sort(num);
	
	for(Integer j:num) {
		System.out.println(j);
	}
	System.out.println("---------------------");
	Collections.sort(num,Collections.reverseOrder());
	for(Integer j:num) {
		System.out.println(j);
	}
	
	System.out.println("************************************");
ArrayList<String>nameList= new ArrayList<String>();
	
	nameList.add("Lisa");//0
	nameList.add("Joy");//1
	
	nameList.add(nameList.size()-nameList.size(),"Naveen");
	
	for(String h:nameList) {
		System.out.println(h);
	}

	}
	
	//flipkart=10000  //Arraylist
	
	//Co founders=3  //array
	
	
	//WebPage
	//30 Links
	//get all the links store in to array list
	//start loop
	//get text of each link
	//Click on respective link
	//break;
	
	
	
}
