package ttt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass extends ExcelIntegrationWithSelenium{
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\eclipse-workspace\\Sample1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys(getData(1,0));
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(getData(1,1));
	
}
}