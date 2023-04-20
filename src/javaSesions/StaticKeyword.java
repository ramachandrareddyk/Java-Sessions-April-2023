package javaSesions;

public class StaticKeyword {
	
	String name;
	
	static int age;
	
	public void test() {
		System.out.println("This is non static method");
	}
	
	public static void test1() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		StaticKeyword st= new StaticKeyword();
		
		st.name="Peter";
		System.out.println(st.name);
		st.test();

		//how to call static variables and methods
		//1. By using class name
		StaticKeyword.age=56;
		System.out.println(StaticKeyword.age);
		
		StaticKeyword.test1();
		
		//2. Call dairectly (current class methds and variable)

		System.out.println(age=34);
		test1();
		
		//3. By using object
		st.age=45;
		System.out.println(st.age);
		st.test1();
	}

}
