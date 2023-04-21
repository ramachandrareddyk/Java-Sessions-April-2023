package overRiding;

public class Bike extends Vehicale{

	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();

	}
	@Override
	public void run() {
		System.out.println("Bike is running safely");
	}

}
