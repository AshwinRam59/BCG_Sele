package Axis.BCG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Invokechrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.selenium.dev");
	}
}