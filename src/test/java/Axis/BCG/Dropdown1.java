package Axis.BCG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	

public class Dropdown1 {
			public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			driver.get("http://www.dummypoint.com/seleniumtemplate.html");
			
			driver.manage().window().maximize();

			Thread.sleep(1200);

			WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
			Thread.sleep(1200);
			Select sel = new Select(dropdown);
			Thread.sleep(1200);
			// select by visible text
	 
			sel.selectByVisibleText("Option3");
	 
			Thread.sleep(1200);
	 
			// select by value
	 
			sel.selectByValue("OptionFive");
			Thread.sleep(1200);
			// select by indexing
	 
			sel.selectByIndex(1);
	 
		}
	 
	
			}