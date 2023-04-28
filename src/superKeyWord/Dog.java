package superKeyWord;

public class Dog extends Animal{
	
	String color="White";
	
	public void printColor() {
		System.out.println("current class(dog)"+color);//White
		
		System.out.println("Parent class "+super.color);//black
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
