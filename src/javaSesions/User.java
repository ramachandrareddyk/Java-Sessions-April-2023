package javaSesions;

public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
		User u1= new User();
		
		u1.name="Neeraj";
		u1.age=56;
		u1.city="BLR";
		
		User u2= new User();
		
		u2.name="Sonu";
		u2.age=22;
		u2.city="HYD";
		
		User u3= new User();
		
		u3.name="Sagar";
		u3.age=32;
		u3.city="Pune";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//niraj
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//sonu
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//sagar
		System.out.println("***************");
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Sonu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Sonu
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//sagar
		System.out.println("------------");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Sonu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//sagar
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//sagar
		
		System.out.println("&&&&&&&&&&&&&&&");
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//sonu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//sagar
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//sonu
		
		
		//Create 3 classes test, Test1, Test2
		//each class having 10 instance variable
		//create 10 objects for each class
		//assign values for all the objects
		//print all variable values
		
		
		Employee emp= new Employee();
		emp.name="Test";
		emp.age=44;
		emp.salary=56000;
		emp.isActive=true;
		
		
		
	}

}
