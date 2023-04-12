package javaSesions;

public class SwitchCase {

	public static void main(String[] args) {
		String browser="ie";
		
		switch (browser) {
		case "chrome":{
			System.out.println("Launch Chrome browser");
			break;
		}
		case "ff":{
			System.out.println("Launch ff browser");
			break;
		}
		case "ie":{
			System.out.println("Launch ie browser");
			break;
		}
		case "safari":{
			System.out.println("Launch Safari browser");
			break;
		}
		default:
			System.out.println("Please pss the correct browser name");
			break;
		}

	}

}
