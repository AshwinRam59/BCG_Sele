package Axis.BCG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	

public class Web_Tables {
			public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/tables");
			
			driver.manage().window().maximize();
			Thread.sleep(500);
			
			// Find no of rows
			List<WebElement> rowno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
			int rowcount=rowno.size();
			System.out.println(rowcount);
			
			// Find no of rows
			List<WebElement> colo=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
			int colcount=rowno.size();
			System.out.println(colcount);
			
			WebElement celldata =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
			
			String text= celldata.getText();
			System.out.println(text);
			
			String expectedtext=  "tconway@earthlink.net";
			
			if (text.equals(expectedtext)) {
				System.out.println("cell data is corrected");
			}
			else {
				System.out.println("cell data is wrong");
				
			}
			}
			
			
			
			
			
			}
			