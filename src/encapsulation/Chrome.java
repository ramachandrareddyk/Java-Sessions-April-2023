package encapsulation;

public class Chrome {
	
	public void launchBrowser() {
		
		System.out.println("Launch Browser......");
		
		checkBrowserVersion();
		checkOSVersion();
		checkBrowserExtensions();
		checkBrowserCookies();
	}
	
	
	
	
	private void checkBrowserVersion() {
		System.out.println("Browser Version");
	}
	
	private void checkOSVersion() {
		System.out.println("OS Version");
	}
	
	private void checkBrowserExtensions() {
		System.out.println("Browser Extensions");
	}
	private void checkBrowserCookies() {
		System.out.println("Browser Cookies");
	}
	

}
