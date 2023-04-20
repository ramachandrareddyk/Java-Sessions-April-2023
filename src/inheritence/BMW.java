package inheritence;

public class BMW extends Car{

	public static void main(String[] args) {
		BMW b= new BMW();
		
		b.BmwColor();
		
		b.start();
		
		b.stop();
		
		b.price=50;
		

	}
	
	public void BmwColor() {
		System.out.println("This si blue color");
	}

}
