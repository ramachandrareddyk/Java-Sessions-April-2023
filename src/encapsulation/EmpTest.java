package encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp= new Employee();
		
		emp.setName("Sinija");
		
		System.out.println(emp.getName());
		
		emp.setAge(45);
		
		System.out.println(emp.getAge());
		
		emp.setAge(56);
		
		System.out.println(emp.getAge());
	}

}
