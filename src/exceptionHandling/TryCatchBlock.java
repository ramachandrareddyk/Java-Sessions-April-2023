package exceptionHandling;

public class TryCatchBlock {

	String name;
	public static void main(String[] args) {
		System.out.println("Hi....");
		System.out.println("Hi....");
		System.out.println("Hi....");
		System.out.println("Hi....");
		
		TryCatchBlock tc= new TryCatchBlock();
		tc=null;
		
		try {
		System.out.println(9/0);
		tc.name="Sanjay";
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Bye....");
		System.out.println("Bye....");
		System.out.println("Bye....");
		System.out.println("Bye....");

	}

}
