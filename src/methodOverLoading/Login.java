package methodOverLoading;

public class Login {

	public static void main(String[] args) {
		
		Login log= new Login();
		log.login();
		log.login(34353553, 656466);
		log.login("username", "Password");

	}
	
	public void login() {
		System.out.println("Login");
	}
	public void login(String username, String password) {
		System.out.println("Login with username and password");
	}
	
	public void login(int mobilenum, int OTP) {
		System.out.println("Login with Mobile and OTP");
	}
	
	public void login(String username, String password,int mobilenum, int OTP) {
		System.out.println("Login with username and password using Mobile and OTP");
	}
	
	public void login(String username, String password, String MobileNotification) {
		System.out.println("Login with username and password using notification");
	}
	
	

}
