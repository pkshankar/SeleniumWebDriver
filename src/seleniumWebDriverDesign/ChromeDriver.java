package seleniumWebDriverDesign;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		
		System.out.println("LAUNCHING CHROME BROWSER");
	}

	@Override
	public void get(String url) {
		
		System.out.println("LAUNCHING " + url + " ON CHROME");
	}

	@Override
	public void findElement(String locator) {
		
		System.out.println("FINDING " + locator + " ON CHROME");
	}

	@Override
	public void close() {
		
		System.out.println("CLOSING CHROME BROWSER");
	}

	@Override
	public void quit() {
		
		System.out.println("QUITTING CHROME BROWSER");
	}

}
