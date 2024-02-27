	package Axis.BCG;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class AlertC {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
			
							WebDriver driver = new ChromeDriver();
	
							driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
						
							
							driver.manage().window().maximize()	;
							
							//ALERT
							
						
							driver.findElement(By.xpath("//input[@name='alert']")).click();

							Thread.sleep(2000);
							
							org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
							alert1.accept();
							
							
							//CONFORMATION BOX
							
							driver.findElement(By.xpath("//input[@name='confirmation']")).click();

							Thread.sleep(2000);
							
							org.openqa.selenium.Alert alert2  = driver.switchTo().alert();
							alert2.dismiss();
						
							
							Thread.sleep(2000);
							
							//PROMPT
							
							driver.findElement(By.xpath("//input[@name='prompt']")).click();

							Thread.sleep(2000);
							
							org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
							alert3.accept();

							
							Thread.sleep(2000);
							

						}

					}