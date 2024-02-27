package Axis.BCG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Open the URL
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Click button 1
        WebElement ClickButton1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        ClickButton1.click();

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Close the popup for button 1
        WebElement Close1 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        Close1.click();
        System.out.println("Clicked 1 & Closed the PopUp");

        // Find and click button 2
        WebElement ClickButton2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
        ClickButton2.click();

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Close the popup for button 2
        WebElement Close2 = driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[3]/button"));
        Close2.click();
        System.out.println("Clicked 2 & Closed the PopUp");

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Find and click button 3
        WebElement ClickButton3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
        ClickButton3.click();

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Close the popup for button 3
        WebElement Close3 = driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button"));
        Close3.click();
        System.out.println("Clicked 3 & Closed the PopUp");

        // Wait for 800 milliseconds
        Thread.sleep(800);

        // Close the browser
        driver.quit();
    }
}
