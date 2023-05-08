package interfaceConcept;

public class PrintTest implements Print{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTest pt= new PrintTest();
		
		pt.printing();
		
		pt.test();
	}

	@Override
	public void printing() {
		System.out.println("Print hello");
		
	}

	@Override
	public void test() {
		System.out.println("Thi is test");
		
	}

}
