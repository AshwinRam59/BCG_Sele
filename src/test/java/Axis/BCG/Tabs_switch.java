package Axis.BCG;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	

public class Tabs_switch {
			public static void main(String[] args) throws InterruptedException {


				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		  // vertical down scroll (x and y coordinates)

		  js.executeScript("window.scrollBy(0 , 400)", "");
		WebElement tab = driver.findElement(By.cssSelector("#tabButton"));
		tab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String>  itr = allWindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String txt = text.getText();
			System.out.println(txt);
		}
			driver.switchTo().window(parentwindow);
		}








	}

}

