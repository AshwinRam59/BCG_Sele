package Axis.BCG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // Adjust time as needed
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

        // Handling alert
        WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        ClickMe1.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Clicked on ClickMe1 and alert handled successfully");

        // Handling popup
        WebElement ClickMe2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
        ClickMe2.click();
        WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
        Close.click();
        System.out.println("Clicked on ClickMe2 and Popup handled successfully");

        // Handling alert inside an iframe
        WebElement ClickMe3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
        ClickMe3.click();
        WebElement clickme = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]"));
        clickme.click();
        WebElement ajaxclose = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        ajaxclose.click();
        System.out.println("Clicked on ClickMe3 to get to [Click_Me] inside & Popup handled successfully");
        driver.navigate().back();

        // Handling confirmation alert
        WebElement ClickMe4 = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
        ClickMe4.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        System.out.println("Clicked on ClickMe4 and Confirmation accepted successfully");

        // Handling confirmation alert
        WebElement ClickMe4a = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
        ClickMe4a.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.dismiss();
        System.out.println("Clicked on ClickMe4 and Confirmation dismissed successfully");

        // Close the browser
        driver.quit();
    }
}
