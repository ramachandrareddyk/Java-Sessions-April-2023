package javaSesions;

public class StringManupulationConcept {

	public static void main(String[] args) {
		String str="This is my first java program";
		
		String st= new String("This is my first Automation program");
		
		System.out.println("----------get Length of the String-------------");
		int length=str.length();
		System.out.println(length);//29
		
		System.out.println("Lowest index is ="+0);//0
		System.out.println("Highest index is ="+(length-1));//29-1=28
		
		System.out.println("-------------Get the character based on index----------");
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(28));
		System.out.println(str.charAt(14));
		
		//System.out.println(str.charAt(29));//StringIndexOutOfBoundsException

		System.out.println("-------------Get the index based on chracter----------");
		
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("f"));
		
		System.out.println(str.indexOf("z"));
		
		System.out.println(str.indexOf("my"));
		
		System.out.println(str.indexOf("Dog"));
		
		System.out.println("============Trim===========");
		
		String s="      Hello Testing       ";
		
		System.out.println(s);
		
		System.out.println(s.trim());
		
		System.out.println("============Replace===========");
		
		String date="08/05/2023";//-
		
		System.out.println(date.replace("/", "-"));
		
		String str1="java;python;c#;C++";
		System.out.println(str1.replace(";", " "));
		
		System.out.println("============Uppercase===========");
		
		String s1="testing";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println("============Lower Case===========");
		
		String s2="SELENIUM";
		System.out.println(s2.toLowerCase());
		
		System.out.println("-----------String Comparision-------------");
		String a="Selenium";
		String b="Selenium";
		
		System.out.println(a.equals(b));//True
		
		String c="selenium";
		
		System.out.println(a.equals(c));
		
		System.out.println(a.equalsIgnoreCase(c));
		String d="Testing";
		System.out.println(a.equalsIgnoreCase(d));
		
		String e="Selenium WebDriver";
		
		System.out.println(e.contains("Driver"));
		System.out.println(e.contains("test"));
		
		System.out.println("---------------split function----------------");
		
		String str2="java;python;c#;C++";
		String cources[]=str2.split(";");
		for(String f:cources) {
			System.out.println(f);
		}
		
		String str3="This is my first java program";
		
		String words[]=str3.split(" ");
		
		for(String f:words) {
			System.out.println(f);
		}
		
		System.out.println("------------Sub String-------------");
		
		String total="Your total marks is 100";
		
		System.out.println(total.substring(5));
		
		System.out.println(total.substring(10));
		
		System.out.println(total.substring(5, 10));
		
		System.out.println("-----------Convert String to Integer-----------");
		
		String Amount="500000";
		int y=100000;
		System.out.println(y+Amount);
		
		int x=Integer.parseInt(Amount);
		System.out.println(x);
		
		System.out.println(x+y);
		
		System.out.println("----------------String Reverse---------------");
		
		String z="abcdefgh";//8
		//hgfedcba
		
		String rev="";//7
		for(int i=z.length()-1;i>=0;i--) {
			rev=rev+z.charAt(i);	
		}
		System.out.println(rev);
		
		System.out.println("--------------------------");
		StringBuffer t= new StringBuffer(z);
		System.out.println(t.reverse());
		
		
		
		
	}

}
