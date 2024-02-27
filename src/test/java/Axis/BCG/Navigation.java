package Axis.BCG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

		
	WebDriver driver = new ChromeDriver();
	//Get URL
	driver.get("https://automationexercise.com/");
	
	//Navigate forward
	driver.navigate().forward();
	
	Thread.sleep(500);
	
	//Navigate back
	driver.navigate().back();
	
	Thread.sleep(500);
	//Navigate  refresh
	driver.navigate().refresh();
	
	driver.close();
	}
}