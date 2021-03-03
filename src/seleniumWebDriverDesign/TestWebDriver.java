package seleniumWebDriverDesign;

public class TestWebDriver {

	public static void main(String[] args) {
		
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.google.com");
		driverChrome.findElement("Google search");
		driverChrome.close();
		driverChrome.quit();
		
		System.out.println("**************************");
		
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com");
		driverFirefox.findElement("Google search");
		driverFirefox.close();
		driverFirefox.quit();

	}

}
