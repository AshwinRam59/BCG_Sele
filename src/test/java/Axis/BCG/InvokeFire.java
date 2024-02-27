package Axis.BCG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFire {
	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.Gecko.driver",
		"\"C:\\\\Users\\\\ashwi\\\\Downloads\\\\edge\\\\geckodriver.exe");
			
			
			
		 	WebDriver driver=new FirefoxDriver();
				 driver.get("https://www.selenium.dev/");

			}
	




}
