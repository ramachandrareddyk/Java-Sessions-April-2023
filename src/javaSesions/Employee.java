package javaSesions;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isActive;
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.name="Tom";
		emp.age=57;
		emp.salary=56000.00;
		emp.isActive=true;
		
		Employee emp1= new Employee();
		emp1.name="Peter";
		emp1.age=47;
		emp1.salary=66000.00;
		emp1.isActive=false;
		
		Employee emp2= new Employee();
		emp.name="jon";
		emp.age=23;
		
		System.out.println(emp.name+" "+emp.age+" "+emp.salary+" "+emp.isActive);
		
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary+" "+emp1.isActive);
		
		Employee emp3= new Employee();
		
		emp3=null;//null ref object
		emp3.name="Testing";//get NullPointerException
		
		//Garbage collector clear the objects which have no ref
		//and having null ref
		System.gc();
		
		new Employee().name="Lisa";
		new Employee().age=31;
		
	}

}
