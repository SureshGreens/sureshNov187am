import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Kumar\\eclipse-workspace\\SeleniumBrowser\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("Suresh");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("suresh");
		WebElement btnlogin = driver.findElement(By.id("u_0_b"));
		btnlogin.click();
	}

}
