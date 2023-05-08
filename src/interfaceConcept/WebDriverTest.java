package interfaceConcept;

public class WebDriverTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String Browser = "Chrome";
		if (Browser.equals("Chrome")) {
			driver = new Chrome();
		} else if (Browser.equals("firefox")) {
			driver = new Firefox();
		}
		
		
		driver.navigate();

	}

}
