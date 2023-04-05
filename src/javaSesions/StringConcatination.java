package javaSesions;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is the non premitive data type
		
		String s = "Hello Testing";
		System.out.println(s);
		
		String s1="1000";
		System.out.println(s1);
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Automation";
		
		System.out.println(a+b);//300 it will perform mathamatical operation
		System.out.println(x+y);//HelloAutomation Concatinater operater  10002000
		
		System.out.println(a+b+x+y);//300HelloAutomation
		
		System.out.println(x+y+a+b);//HelloAutomation100200
		
		System.out.println(x+y+(a+b));//HelloAutomation300
		
		System.out.println("The value of a is= "+a);//Concatination
		
		System.out.println("the Sum is ="+a+b);//(String+int+int)
		
		System.out.println("the Sum is ="+(a+b));
		
		System.out.println(a+b+" this is the sum");//(int+int+String)
		
		double d=12.33;
		double d1=11.01;
		
		//byte, short, int, long, float, double will store number values
		
		//Char will store only character
		
		//String stores group of chracters
		
		System.out.println(d+d1);//23.34
		
		//a=100
		//b=200
		

		//String x="Hello";
		//String y="Automation";
		
		System.out.println(a+b+d+d1);
		
		System.out.println(a+b+d+d1+x+y);
		
		System.out.println(x+y+a+b+d+d1);//HelloAutomation10020023.3311.01
		
		System.out.println(x+y+(a+b+d+d1));
		System.out.println("-----------------------------------");
		char c='a';//97
		char c1='b';//98
		
		System.out.println(c+c1);//ab
		
		//a-z=97-122
		//A-Z=65-90
		//0-9=48-57
		
		System.out.println(10+20);//30
		System.out.println("10"+"20");//1020
		
		System.out.println(20-10);
		
		System.out.println(20*10);
		
		System.out.println(4/2);//2
		
		System.out.println(5/2);//2
		
		System.out.println(100/10);//10
		
		System.out.println(5%2);
		
		System.out.println(100%10);
		
		int f=10;
		int g=2;
		System.out.println(f/g);
		System.out.println(f%g);
		
		

	}

}
