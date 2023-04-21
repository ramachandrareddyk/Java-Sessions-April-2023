package overRiding;

public class BankTest {

	public static void main(String[] args) {
		SBI s= new SBI();
		ICICI i= new ICICI();
		HDFC h= new HDFC();
		System.out.println("SBI = "+s.getRateOfIntrest());
		System.out.println("ICICI = "+i.getRateOfIntrest());
		System.out.println("HDFC = "+h.getRateOfIntrest());

	}

}
