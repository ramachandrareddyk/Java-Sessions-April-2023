package exceptionHandling;

public class FinalyBlock {

	public static void main(String[] args) {
		try {
			System.out.println(9/0);
		}catch (ArithmeticException e) {
			System.out.println("AE exception....");
		}
		finally {
			System.out.println("Bye....");
		}
		
		System.out.println(getNum("Ravi"));
		

	}
	
	public static int getNum(String name) {
		
		if(name.equals("Tom")) {
		try {
			int marks=90/2;
			return marks;
		} catch (ArithmeticException e) {
			return 40;
		} finally {
			return 10;
		}
	}else if(name.equals("Ravi")) {
		return 100;
	}else {
		return 50;
	}
	}

}
