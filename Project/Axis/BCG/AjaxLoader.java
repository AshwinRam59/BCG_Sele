package Axis.BCG;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxLoader {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait for the element to be visible and clickable
        WebElement clickme = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]")));
        clickme.click();
        System.out.println("Clicked on 'Click Me'");

        // Wait for the popup to be visible and clickable
        WebElement ajaxclose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")));
        ajaxclose.click();
        System.out.println("Popup Handled");

        // Close the browser
        driver.quit();
    }
}
