package Axis.BCG;
	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class ActionExam {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
							WebDriver driver = new ChromeDriver();
	
							driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
						
							
							driver.manage().window().maximize()	;
							
							WebElement Doublecli = driver.findElement(By.xpath("//input[@id='double-click']"));
							Actions builder = new Actions(driver);
							builder.doubleClick(Doublecli).perform();
							System.out.println("Double click performed");
							Thread.sleep(500);
							Alert alt =driver.switchTo().alert();
							alt.accept();
							
							builder.contextClick(Doublecli).perform();
							
						

					        Thread.sleep(2000); // Add a delay to see the effect

					        driver.quit();
							
							
							
		}
	}