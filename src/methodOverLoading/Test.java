package methodOverLoading;

public class Test {

	
	public void m1() {
		System.out.println("Test");
	}
	
	public void m1(int a) {
		System.out.println(a);
	}
	
	public void m1(String name) {
		System.out.println(name);
	}
	
	public void m1(Double salary) {
		System.out.println(salary);
	}
	
	public void m1(int a, String name) {
		System.out.println(a+name);
	}
	
	public void m1(int a, double name) {
		System.out.println(a+name);
	}
	
	
	//Calss having multiple methods with same name
	//with deferent parameters and different number of parameteres
}
