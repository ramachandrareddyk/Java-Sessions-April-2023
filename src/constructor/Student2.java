package constructor;

public class Student2 {
	
	int id;
	String name;
	int age;
	int marks;
	
	public Student2(int i, int a) {
		id=i;
		age=a;
	}
	
	public Student2(int m, String n) {
		marks=m;
		name=n;
	}
	public Student2(int m, String n,int i, int a) {
		marks=m;
		name=n;
		id=i;
		age=a;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+age+" "+marks);
	}
	
	public static void main(String[] args) {
		Student2 s= new Student2(111, 18);
		Student2 s1= new Student2(111, "Naresh");
		Student2 s2= new Student2(111, "Naresh",18,888);
		
		s.display();
		
		s1.display();
		
		s2.display();
	}

}
