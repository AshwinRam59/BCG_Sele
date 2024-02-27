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
	

public class Frames {
			public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				 
				driver.get("https://the-internet.herokuapp.com/iframe");
		 
				driver.manage().window().maximize();
		 
				Thread.sleep(500);
		 
				WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
				driver.switchTo().frame(frame1);
				WebElement content = driver.findElement(By.id("tinymce"));
				content.clear();
				content.sendKeys("hello world");





		 
		 
			}
		 
		}