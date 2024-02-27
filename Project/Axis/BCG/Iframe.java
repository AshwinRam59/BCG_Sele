package Axis.BCG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/IFrame/index.html");
        driver.manage().window().maximize();

        // Wait for a short duration to ensure the page is fully loaded
        Thread.sleep(500);

        // Switch to the iframe
        WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(newFrame);
        System.out.println("Switched to the iframe");

        // Click on element in the iframe
        driver.findElement(By.id("nav-title")).click();
        System.out.println("Clicked on 'Our Products' in the new frame");
    }
}
