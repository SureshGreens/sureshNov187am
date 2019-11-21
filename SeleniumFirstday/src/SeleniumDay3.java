import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\eclipse-workspace\\SeleniumFirstday\\Drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement b = driver.findElement(By.xpath("//span[@class='testimonial-content'][1]"));
	String name = b.getText();	
	System.out.println(name);
	driver.quit();
}
}
