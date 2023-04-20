package javaSesions;

public class Car {

	String carName;
	int price;
	String color;
	static int wheels=4;
	public static void main(String[] args) {
		Car BMW= new Car();
		
		BMW.carName="XL6";
		BMW.price=50;
		BMW.color="White";
		
		Car audi=new Car();
		
		audi.carName="Q4";
		audi.price=35;
		audi.color="Blue";
		
		Car Maruthi= new Car();
		
		Maruthi.carName="Baleno";
		Maruthi.price=10;
		Maruthi.color="Black";
		
		System.out.println(BMW.carName+" "+BMW.price+" "+BMW.color+"  "+wheels);
		
		System.out.println(audi.carName+" "+audi.price+" "+audi.color+"  "+wheels);
		
		System.out.println(Maruthi.carName+" "+Maruthi.price+" "+Maruthi.color+"  "+wheels);

	}

}
