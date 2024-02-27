package Axis.BCG;
	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class ActinDragandDrop {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
							WebDriver driver = new ChromeDriver();
	
							driver.get("https://the-internet.herokuapp.com/drag_and_drop");
						
							
							driver.manage().window().maximize()	;
							Thread.sleep(500); 
							WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
							WebElement des = driver.findElement(By.xpath("//div[@id='column-b']"));
							Actions builder = new Actions(driver);
							builder.dragAndDrop(src, des).perform();
							System.out.println("Drag and Drop click performed");
							Thread.sleep(500);
							

					        driver.quit();
							
							
							
		}
	}	