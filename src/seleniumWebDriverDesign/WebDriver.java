package seleniumWebDriverDesign;

import org.openqa.selenium.By;

public interface WebDriver {
	
	public void get(String url);
	
	public void findElement(String locator);
	
	public void close();
	
	public void quit();

}
