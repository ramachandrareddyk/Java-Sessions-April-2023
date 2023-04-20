package inheritence;

public class Programmer extends Employee{

	int bonus=10000;
	
	public static void main(String[] args) {
		Programmer p= new Programmer();
		
		System.out.println("Employe salry is = "+(p.bonus+p.salary));
		

	}

}
