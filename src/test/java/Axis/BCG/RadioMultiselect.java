package Axis.BCG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioMultiselect {
	public static <webelememts> void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

		
	WebDriver driver = new ChromeDriver();
	//Get URL
	driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	driver.manage().window().maximize();
	List <WebElement> allradio = driver.findElements(By.xpath("(//input[@name= 'ageGroup']"));
	Thread.sleep(2000);
	for (WebElement wb : allradio) {
		wb.click();
		
	}
	}
}