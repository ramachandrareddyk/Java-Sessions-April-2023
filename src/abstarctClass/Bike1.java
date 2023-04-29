package abstarctClass;

public abstract class Bike1 {
	
	Bike1(){
		System.out.println("Bike 1 constructor");
	}
	
	abstract void run();
	
	public void bikeStart() {
		System.out.println("Bike started");
	}

}
