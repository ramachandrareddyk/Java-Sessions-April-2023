package accessModifires;

public class Test {
	
	public int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
		t.age=46;
		
		System.out.println(t.age);
		
		t.m1();
		
		System.out.println(t.salary);
		
		t.m2();
		
		t.name="John";
		
		t.m3();
		
	
		System.out.println(t.companyName);
		
		t.m4();
	}
	
	//1.Public
	//2.Default
	//3.Private
	//4.Protected
	
	//1.Public
	public void m1() {
		System.out.println("This is public method");
	}
	//2.Default
	
	//diclare any method or variable without access modifire that is defaualt
	
	int salary=56000;
	
	void m2() {
		System.out.println("This is deafulat method");
	}
	
	//3.Private
	
	private String name;
	
	private void m3() {
		System.out.println("This is private method");
	}
	
	//4.Protected
	
	protected String companyName="ICT";
	
	protected void m4() {
		System.out.println("This is protected Method");
	}
	

}
