package methodOverLoading;

public class ProductSearch {

	public static void main(String[] args) {
		
		ProductSearch p= new ProductSearch();
		p.search();
		p.search("mobile");
		p.search("Apple", "Mobile");

	}
	
	
	public static void m1() {
		System.out.println("M1");
	}
	
	public void m1(int a, int b) {
		System.out.println(a+b);
	}
	
	
	
	public void search() {
		System.out.println("search");
	}
	
	public void search(String ProductName) {
		System.out.println("search with product name");
	}
	
	public void search(String ProductName, String Brand) {
		System.out.println("search with product name with brand");
	}
	
	public void search(String ProductName, String Model, int price) {
		System.out.println("search with product name, model and price");
	}
	
	public void search(String ProductName,String brand, String Model, int price) {
		System.out.println("search with product name, Brand, Modal and Price");
	}
	
	public void search(int productId) {
		System.out.println("Search with product id");
	}

}
