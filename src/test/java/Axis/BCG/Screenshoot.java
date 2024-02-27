package Axis.BCG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Screenshoot {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        File F = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(F, new File("C:\\Users\\ashwi\\OneDrive\\Documents\\screenshoot.png"));
        System.out.println("Screenshot captured");

        Thread.sleep(1000);

        driver.quit();
    }

}
