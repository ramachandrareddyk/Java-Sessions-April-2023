package encapsulation;

public class ComTest {

	public static void main(String[] args) {
		Company com= new Company();
		
		com.setSalary(45000.00);
		
		double a= com.getSalary();

		System.out.println(a);
	}

}
