package Axis.BCG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

		
	WebDriver driver = new ChromeDriver();
	//Get URL
	driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	driver.manage().window().maximize();
	 WebElement radioButton = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1]"));
     Thread.sleep(500);
 	 if (radioButton.isDisplayed());
 	 radioButton.click();
	 driver.close();
	}
}