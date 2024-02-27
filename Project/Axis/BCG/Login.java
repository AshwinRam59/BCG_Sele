package Axis.BCG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Set implicit wait time for elements to be found
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        // Navigate to the login page
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
        
        // Find and fill the username field
        WebElement Username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        Username.sendKeys("webdriver");
        System.out.println("Username entered");

        // Find and fill the password field
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password.sendKeys("webdriver123");
        System.out.println("Password entered");

        // Find and click the login button
        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        LoginButton.click();
        System.out.println("Clicked on login");

        // Switch to the alert and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Validation Successful");

        // Close the browser
        driver.quit();
    }
}
