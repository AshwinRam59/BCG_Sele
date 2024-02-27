package Axis.BCG;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	

public class Implicit_weight {
			public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/tables");
			
			driver.manage().window().maximize();
			// implicit wait will wait for all the elements in the script to load before it could throw 
			//element not found exception

			driver.manage().timeouts().implicitlyWait(20 , TimeUnit.MILLISECONDS);
			Thread.sleep(1200);

			List<WebElement> rownumber = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
			int rowcount = rownumber.size();
			
			System.out.println(rowcount);
			
			Thread.sleep(1200);
			List<WebElement> colnumber = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr[1]/td"));
			int colcount = colnumber.size();
			
			System.out.println(colcount);
			// explicit wait is used to wait for a particular element based on the expected condition
			// explicit wait - to wait for the compose button to be click-able
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
			Thread.sleep(1200);
			
			WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]  /td[4]"));
			
			String text = celldata.getText();
			System.out.println(text);
			
			String expectedtext = "$50.00";
			
			if(text.equals(expectedtext)) {
				
				System.out.println("The cell data is right");
			}
				else {
					System.out.println("The cell data is wrong");
					
			}
}}