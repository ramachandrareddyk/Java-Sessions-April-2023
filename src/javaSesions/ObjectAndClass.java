package javaSesions;

public class ObjectAndClass {
	
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java is the object Oriented programing (Oop's)
		//Oop's is the methodology to design a programe using class and object
		
		//1. Class
		//2. Object
		//3. Inheritence
		//4. Polymorphisam
				//a. Method overloading
				//b. Method Overriding
		//5. Encapsulation
		//6. Abstraction
				//1. Abstract class
				//2. Interface
		
		//class: class is the group of objects which have comman properties,
		//it is templete or bluprint for creating an object
		
		//Variables
		//Methods
		//blocks
		//Constructors
		//Nested class
		
		String name="Peter";//Local variable
		System.out.println(name);
		//class name  //ref //key  //Object
		ObjectAndClass obj = new   ObjectAndClass();
		
		//to create an object we have to use new keyword
		
		obj.name="Tom";
		obj.age=45;
		obj.salary=56000.00;
		obj.isActive=true;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isActive);
		
		
	}

}
