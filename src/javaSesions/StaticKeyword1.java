package javaSesions;

public class StaticKeyword1 {

	public static void main(String[] args) {
		StaticKeyword.age=56;
		System.out.println(StaticKeyword.age);
		
		StaticKeyword.test1();
		
		StaticKeyword st= new StaticKeyword();
		
		st.name="Manohar";
		st.test();

	}

}
