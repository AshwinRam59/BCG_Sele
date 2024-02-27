package Axis.BCG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Datepicker/index.html");
        driver.manage().window().maximize();

        // Click on the date picker element
        driver.findElement(By.xpath("//*[@id='datepicker']/span")).click();

        // Select the date '20' from the date picker
        driver.findElement(By.xpath("//td[contains(text(),'20')]")).click();

        // Print message confirming date selection
        System.out.println("Date selected: 02-20-2024");

        // Close the browser
        driver.close();
    }
}
