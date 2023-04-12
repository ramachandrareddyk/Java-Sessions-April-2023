package javaSesions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 * System.out.println("4");
		 */
		//To avoid the repetative statements we have to use loops
		
		//While loop
		//For loop
		//Do while loop
		
		//1-100
		//While loop
		System.out.println("--------While loop------------");
		int i=1;//initialization
		while(i<=100) {//condition
			System.out.println(i);//statement or logic
			i++;//increment or decrement
			i=i+1;
			++i;
		}
		System.out.println("*******************************");
		
		int k=1;
		while(k<=10) {
			System.out.println(k++);
		}
		System.out.println("--------For loop------------");
		//for loop
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		
		System.out.println("***********");
		
		for(int j=1;j<=10;) {
			System.out.println(j);
			j++;
		}
		
		int x=1;//unwanted
		for(x=1;x<=10;x++) {
			System.out.println(x);
		}
		System.out.println("**************************");
		/*
		 * for(int j=0;j<=100;) { System.out.println("Testing"); }
		 */
		/*
		 * for(;;) { System.out.println("Hello"); }
		 */
		for(int j=10;j>0;j--) {
			System.out.println(j);
		}
		System.out.println("**********************");
		//Alphabits
		for(int c='a';c<='z';c++) {
			System.out.println(c);
		}
		System.out.println("**********************");
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		System.out.println("**********************");
		for(char c='A';c<='Z';c++) {
			System.out.println(c);
		}
		
		System.out.println("**********************");
		for(double d=1.1;d<10.0;d++) {
			System.out.println(d);
		}
		
		System.out.println("**********************");
		for(int j=1;j<=10;j++) {
			if(j%5==0) {
				System.out.println(j);
			}
		}
		
		System.out.println("*************break*****************");
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			if(j%5==0) {
				break;
			}
		}
		
		System.out.println("*************even numbers*****************");//0, 2, 4,6 8,10
		for(int j=0;j<=100;j=j+2) {
			System.out.println(j);
		}
		System.out.println("*************Odd numbers*****************");//1, 3, 5,7 9,11
		for(int j=1;j<=100;j=j+2) {
			System.out.println(j);
		}
		
		//Assignment
		//Print even and odd numbers
		
		System.out.println("---------------do while loop-----------------");
		//Do while loop
		int y=0;
		do {
			System.out.println(y);
			y++;
		}while(y<=10);
	}

}
