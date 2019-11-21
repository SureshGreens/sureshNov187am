import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumFirstday {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Suresh Kumar\\eclipse-workspace\\Seleniumsecondday\\Drivers\\IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://www.greenstechnologies.in/");
	String title = driver.getTitle();
	System.out.println("Title is"+title);		
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL is"+currentUrl);
	//driver.quit();
	
	}

}
