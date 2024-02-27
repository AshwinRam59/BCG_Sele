package Axis.BCG;
	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
	
	public class KEyboard {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
							WebDriver driver = new ChromeDriver();
	
							driver.get("https://www.facebook.com/");
						
							
							driver.manage().window().maximize()	;
				driver.manage().window().maximize();
				Thread.sleep(500);
				WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
				Actions builder = new Actions(driver);
				// action class to be used when we need to do  series of actions together.
				Action seriesofact = builder.moveToElement(email).click().
						keyDown(email, Keys.SHIFT).sendKeys(email, "aSHWIN23").build();
				seriesofact.perform();


 
 
	}
 
}