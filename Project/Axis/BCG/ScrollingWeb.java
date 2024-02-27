package Axis.BCG;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWeb {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Scrolling/index.html");
        driver.manage().window().maximize();

        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 800 pixels
        js.executeScript("window.scrollBy(0, 800)");

        // Scroll up by 800 pixels
        js.executeScript("window.scrollBy(0, -800)");

        // Scroll to a specific element
        WebElement scroll = driver.findElement(By.xpath("//div[@id='zone4']"));
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);

        // Print message confirming scrolling
        System.out.println("Page scrolled up, down, and to the specified element successfully");

        // Close the browser
        driver.quit();
    }
}
