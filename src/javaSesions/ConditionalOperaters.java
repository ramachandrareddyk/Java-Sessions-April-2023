package javaSesions;

public class ConditionalOperaters {

	public static void main(String[] args) {
		
		// < > <= >= == !=
		
		int a=10;
		int b=20;
		
		System.out.println(a<b);
		
		//if
		//if else
		//Nested if
		//if else if
		//Switch case
		
		if(a<b) {
			System.out.println("Hello");
		}
		
		if(a>b) {
			System.out.println("Bye...");
		}
		/*
		 * if(true) { System.out.println("Testing"); }
		 */
		
		if(a>b) {
			System.out.println("Testing");
		} else {
			System.out.println("Development");
		}
		
		if(a == b) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
		b=10;
		
		if(a!=b) {
			System.out.println("Testing pass");
		}else {
			System.out.println("Testing faill");
		}
		
		//dead code
		/*
		 * if(false) { System.out.println("Development pass"); } else {
		 * System.out.println("Development faill"); }
		 */
		
		String s1="Selenium";
		String s2="Selenium";
		
		if(s1 == s2) {
			System.out.println("Both the strings are equal");
		} else {
			System.out.println("Both the strings are not equal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Both the strings are equal");
		} else {
			System.out.println("Both the strings are not equal");
		}
		
		System.out.println("--------------------------------");
		//nested if
		
		int marks=40;
		if(marks>=50) {
			System.out.println("Pass");
			if(marks>=70) {
				System.out.println("Grade A");
				if(marks>=85) {
					System.out.println("Grade A++");
				}
			}
		}else {
			System.out.println("fail");
		}
		
		//if else if
		System.out.println("-----------if else if-------------------");
		
		if(marks>=85) {
			System.out.println("Grade A++");
		} else if(marks>=70) {
			System.out.println("grade A");
		}else if(marks>=50) {
			System.out.println("Pass");
		}else {
			System.out.println("Faill");
		}
		
		//100 test cases
		//Chrme, FF, IE
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		if(browser.equals("FF")) {
			System.out.println("Launch FF");
		}
		if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}
		
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("FF")) {
			System.out.println("Launch FF");
		}
		else if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}else {
			System.out.println("Plase pass the correct browser name");
		}
		
		
		//&& and
		//|| or
		
		System.out.println("-----------Comparing multiple variables------------");
		int x=135;
		int y=2000;
		int z=67;
		if(x>y && x>z) {
			System.out.println(" X is the max value");
		}else if(y>z) {
			System.out.println("Y is the max value");
		}else {
			System.out.println("Z is the max value");
		}
		//1. Max value
		int c=45;
		int d=87;
		int e=23;
		int f=13;
		int g=47;
		int h=200;
		
		

	}

}
