package methodOverLoading;

public class OverloadMainMethod1 {

	public static void main(String[] args) {
		
		OverloadMainMethod1 obj= new OverloadMainMethod1();
		
		System.out.println("Original main method");
		
		obj.main(true);
		
		obj.main(10);
		
	}
	
	public static void main(boolean args) {
		if(args) {
			System.out.println("Overloded main method with boolean");
			
			System.out.println(args);
		}
	}
	
	public static void main(int args) {
		System.out.println("Overloded main method with int");
		System.out.println(args);
	}

}
