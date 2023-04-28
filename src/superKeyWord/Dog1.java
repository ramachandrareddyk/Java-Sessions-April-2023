package superKeyWord;

public class Dog1 extends Animal1{
	
	public void eat() {
		System.out.println("eating bread....");
	
	}
	
	public void brek() {
		System.out.println("taking break.....");
	
	}
	
	public void work() {
		super.eat();
		
		brek();
	}

}
