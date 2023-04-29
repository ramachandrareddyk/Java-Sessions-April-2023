package abstarctClass;

public class BankTest {

	public static void main(String[] args) {
		SBI s= new SBI();
		System.out.println(s.getRateOfIntrest());
		
		HDFC h= new HDFC();
		System.out.println(h.getRateOfIntrest());
		
		icici ic= new icici();
		
		System.out.println(ic.getRateOfIntrest());

	}

}
