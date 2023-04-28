package constructor;

public class Student3 {
	
	Student2 s;
	
	public Student3() {
		s= new Student2(111,18);
		
		System.out.println("Objet created");
	}
	
	public void display() {
		System.out.println("this is display");
		
		s.display();
	}
	
	public static void main(String[] args) {
	
		Student3 st= new Student3();
		
		st.display();
	}

}
