package abstarctClass;

public class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("RUnning safely");
	}
	
	public static void main(String[] args) {
		Honda h= new Honda();
		
		h.run();
	}

}
