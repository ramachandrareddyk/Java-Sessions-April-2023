package interfaceConcept;

public class A implements Print, Show{

	@Override
	public void showing() {
		System.out.println("Showing");
		
	}

	@Override
	public void printing() {
		System.out.println("Printing");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Testing");
	}
	
	public static void main(String[] args) {
		Show s= new A();
		
		s.showing();
		
		Print p= new A();
		p.printing();
	}

}
