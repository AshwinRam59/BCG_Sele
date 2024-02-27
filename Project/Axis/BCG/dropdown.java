package Axis.BCG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        // Selecting option from dropdown by value
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdowm-menu-1']"));
        Select drop = new Select(dropdown);
        drop.selectByValue("python");
        System.out.println("Selected from the dropdown - Python");

        // Selecting option from dropdown by visible text
        Select drop1 = new Select(driver.findElement(By.xpath("//*[@id='dropdowm-menu-2']")));
        drop1.selectByVisibleText("Maven");
        System.out.println("Selected from the dropdown - Maven");

        // Selecting option from dropdown by visible text
        Select drop2 = new Select(driver.findElement(By.xpath("//*[@id='dropdowm-menu-3']")));
        drop2.selectByVisibleText("CSS");
        System.out.println("Selected from the dropdown - CSS");

        // Clicking on checkbox if not selected
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/label[3]/input"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // Clicking on checkbox if enabled
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/label[1]/input"));
        if (checkbox1.isEnabled()) {
            checkbox1.click();
        }
        System.out.println("Clicked on Checkbox");

        // Selecting all radio buttons
        List<WebElement> radiolist = driver.findElements(By.xpath("//input[@name='color']"));
        for (WebElement radio : radiolist) {
            radio.click();
        }
        System.out.println("Selected all Radio buttons");

        // Close the browser
        driver.quit();
    }
}
