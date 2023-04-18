package javaSesions;

public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method also we can call it as function
		//Method is way to perform some task
		//method having block of code, Collection of statements, set of code
		
		
		//accceess modifire
		//return type
		//method name
		//parameters
		//method body
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		obj.m1();
		
		obj.sum(45, 23);
		
		obj.sum(60, 120);
		
		int x=obj.add();
		
		System.out.println(x);
		
		int y=obj.m2(34, 45);
		
		System.out.println(y);

	}
	//duplicate methods are not allowed
	//user can't able to create method inside the method
	public void test() {
		System.out.println("Test Automation");
		m1();
	
	}
	
	
	//1. No return no input
	
	public void m1() {
		System.out.println("No return no input method");
	}

	
	//2. No return some inputs
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	//3. No input with some return
	//at same time we can't use void and return key word
	//we can't able to return multiple values using return key word
	public int add() {
		int a=10;
		int b=20;
		int d=45;
		int c=a+b;
		
		int x=d+c;
		return c;
	}
	
	//4. With some inputs and some return
	
	public int m2(int x, int y) {
		//int c=x+y
		return x+y;
	}
	
	

}
