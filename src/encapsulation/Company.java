package encapsulation;

public class Company {
	
	
	public String name;
	
	public int id;
	
	private double salary;
	
	public void setSalary(double salary) {
		 this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}

}
