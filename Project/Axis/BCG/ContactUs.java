package Axis.BCG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ContactUs {
   @SuppressWarnings("deprecation")
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Set implicit wait time for elements to be found
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        // Navigate to the contact form page
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        // Find and fill the first name field
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Ashwin");
        System.out.println("First name entered: " + firstName.getAttribute("value"));
        // Find and fill the last name field
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Ramteke");
        System.out.println("Last name entered: " + lastName.getAttribute("value"));
        // Find and fill the email field
        WebElement emailId = driver.findElement(By.xpath("//input[@name='email']"));
        emailId.sendKeys("Ashwinba29@gmail.com");
        System.out.println("Email entered: " + emailId.getAttribute("value"));
        // Find and fill the comments field
        WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
        comments.sendKeys("Contact us working as per requirement");
        System.out.println("Comment entered");
        // Find and click the submit button
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
        System.out.println("Thank You for the submission");
        // Navigate back to the contact form page
        driver.navigate().back();
        // Find and click the reset button
        WebElement resetButton = driver.findElement(By.xpath("//input[@type='reset']"));
        resetButton.click();
        System.out.println("Information Reset");
        // Close the browser
        driver.quit();
    }
}