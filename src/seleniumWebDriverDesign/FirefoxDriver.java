package seleniumWebDriverDesign;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		
		System.out.println("LAUNCHING FIREFOX BROWSER");
	}

	@Override
	public void get(String url) {
		
		System.out.println("LAUNCHING " + url + " ON FIREFOX");
	}

	@Override
	public void findElement(String locator) {
		
		System.out.println("FINDING " + locator + " ON FIREFOX");
	}

	@Override
	public void close() {
		
		System.out.println("CLOSING FIREFOX BROWSER");
	}

	@Override
	public void quit() {
		
		System.out.println("QUITTING FIREFOX BROWSER");
	}

}
