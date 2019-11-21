package Mouseoveraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MouseOverAction {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Suresh Kumar\\eclipse-workspace\\SeleniumFirstday\\Drivers\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
		
	
	driver.get("http://www.greenstechnologys.com/");
	
}
