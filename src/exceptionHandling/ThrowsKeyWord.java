package exceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args) {
		ThrowsKeyWord t= new ThrowsKeyWord();
		try {
		t.m1();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}
	
	public void m1() throws ArithmeticException{
		System.out.println("M1");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("M2");
		m3();
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("M3");
		m4();
	}
	
	public void m4() throws ArithmeticException{
		System.out.println("M4");
		int a=9/0;
	}

}
