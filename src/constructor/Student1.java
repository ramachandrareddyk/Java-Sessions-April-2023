package constructor;

public class Student1 {
	
	int id;
	String name;
	
	public Student1(int i, String n) {
		id=i;
		name=n;
		
System.out.println(id);
		
		System.out.println(name);
	}
	
	public void display() {
		System.out.println(id);
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student1 st= new Student1(222, "Kiran");
		
		Student1 st1= new Student1(111, "Arun");
		
		st.display();
		st1.display();
	}

}
