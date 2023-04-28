package constructor;

public class MyClass {
	
	int num;
	
	
	  public MyClass() { num=100; System.out.println(num); }
	 
	
	public static void main(String[] args) {
		MyClass mc= new MyClass();
		
		System.out.println("This is my class");
	}
	
	

}
