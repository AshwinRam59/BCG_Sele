package Axis.BCG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionButtons {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Actions/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        // Perform double click action
        WebElement DoubleClick = driver.findElement(By.xpath("//div[@id='double-click']"));
        Actions doubleclick = new Actions(driver);
        doubleclick.doubleClick(DoubleClick).perform();
        System.out.println("DoubleClick Action Performed");

        // Perform drag and drop action
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions dragdrop = new Actions(driver);
        dragdrop.dragAndDrop(drag, drop).perform();
        System.out.println("Drag And Drop Action successfully performed");

        // Scroll the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        System.out.println("Page scrolled successfully");

        // Perform hover actions and click
        Actions act = new Actions(driver);
        WebElement mov1 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        act.moveToElement(mov1).perform();
        driver.findElement(By.linkText("Link 1")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement mov2 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[2]"));
        act.moveToElement(mov2).perform();
        driver.findElement(By.linkText("Link 2")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        WebElement mov3 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[3]"));
        act.moveToElement(mov3).perform();
        driver.findElement(By.xpath("//div[@id='div-hover']/div[3]/div/a[2]")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();
        System.out.println("Hover Me First, Second, Third successfully performed");

        // Perform click and hold action
        WebElement hold = driver.findElement(By.xpath("//div[@id='click-box']"));
        act.clickAndHold(hold).perform();
        System.out.println("Click and Hold Successfully Performed");

        // Close the browser
        driver.quit();
    }
}
