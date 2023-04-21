package methodOverLoading;

public class OverLoadMainMethod {

	public static void main(String[] args) {
		System.out.println("This is main method");
		
		OverLoadMainMethod obj= new OverLoadMainMethod();
		
		obj.main(7);
		
		obj.main('t');

	}
	
	//is it possible to overload the main method---Yes
	
	public static void main(int args) {
		System.out.println("This is overloded main method with integer");

	}
	
	public static void main(char args) {
		System.out.println("This is overloded main method with char");

	}

}
