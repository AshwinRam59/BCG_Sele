package Axis.BCG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait time to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the URL
        driver.get("https://webdriveruniversity.com/File-Upload/index.html");
        driver.manage().window().maximize();

        // Find the upload element and send the file path
        WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));
        upload.sendKeys("C:\\Users\\ashwi\\Downloads\\Screenshot 2024-02-19 093521.png");

        // Find the download button and click it
        WebElement download = driver.findElement(By.xpath("//input[@id='submit-button']"));
        download.click();

        // Print a message and close the browser
        System.out.println("File uploaded successfully.");
        driver.quit();
    }
}
