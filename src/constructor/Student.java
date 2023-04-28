package constructor;

public class Student {
	
	int id;
	String name;
	
	void m1() {
		System.out.println( id+" "+name);
	}
	
	public static void main(String[] args) {
		Student st= new Student();
		Student st1= new Student();
		
		st.m1();
		
		st1.m1();
				
	}

}
