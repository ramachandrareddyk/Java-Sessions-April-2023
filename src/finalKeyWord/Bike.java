package finalKeyWord;

public class Bike {
	
	//final methods are can't able to override
	//FInal methods can't able to OverLoad
	//Final classes canot able to extends
	//We can initialize the blank final variables but only inside the constructor
	final int speed;
	
	Bike(){
		speed=100;
	}
	
	
	final void run() {
		System.out.println("Running....");
		
		//speed=100;
	}
	
	/*
	 * final void run(int) { System.out.println(); }
	 */

}
