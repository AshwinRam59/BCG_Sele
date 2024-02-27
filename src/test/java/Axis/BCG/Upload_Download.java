	package Axis.BCG;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Upload_Download {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
							WebDriver driver = new ChromeDriver();
	
							driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
						
							
							driver.manage().window().maximize()	;
							
							WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
							
							upload.sendKeys("\"C:\\Users\\ashwi\\Downloads\\Screenshot 2024-02-19 093521.png");
									
							Thread.sleep(1000);
							
							WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
							Thread.sleep(1000);
							
							download.click();
							}
			
	
		}
	
	
