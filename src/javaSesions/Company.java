package javaSesions;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		Company com= new Company();
		
		String founders[]=com.getCoFounders();
		
		System.out.println(founders[0]);
		
		for(String e:founders) {
			System.out.println(e);
		}
		System.out.println("------------------------------");
		ArrayList<String>names=com.getEMpNames();

		for(String e:names) {
			System.out.println(e);
		}
	}
	
	public String getName() {
		String name="Tom";
		
		return name;
	}
	
	public String getempName() {
		return "Phill";
	}
	
	public int count() {
		return 400;
	}
	
	public boolean isActive() {
		return true;
	}
	
//company
	//company founders 3 members
	//tom, peter, jon

	public String[] getCoFounders() {
		String founders[]= {"Tom", "Peter","Jon"};
		
		return founders;
	}
	
	//return all employee names
	
	public ArrayList<String> getEMpNames() {
		ArrayList<String>names=new ArrayList<String>();
		
		names.add("Phill");
		names.add("Sininja");
		names.add("Hima");
		names.add("Manoj");
		names.add("Arun");
		names.add("Obul");
		
		return names;
	}
}
