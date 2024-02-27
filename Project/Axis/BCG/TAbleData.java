package Axis.BCG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TAbleData {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Data-Table/index.html#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        // Counting number of rows in the table
        List<WebElement> rowNumber = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
        int rowCount = rowNumber.size();
        System.out.println("Total number of rows: " + rowCount);

        // Counting number of columns in the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[2]/td"));
        int colCount = columns.size();
        System.out.println("Total number of columns: " + colCount);

        // Fetching data from the first cell of the second row
        WebElement cellFetch = driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[2]/td[1]"));
        String resultFname = cellFetch.getText();

        // Fetching data from the second cell of the second row
        WebElement cellFetch2 = driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[2]/td[2]"));
        String resultLname = cellFetch2.getText();

        // Checking if the fetched data is correct
        String expectedText = "John";
        System.out.println("First name: " + resultFname);
        System.out.println("Last name: " + resultLname);
        if (resultFname.equals(expectedText)) {
            System.out.println("Correct data fetched");
        } else {
            System.out.println("Wrong input or no data found");
        }

        // Entering fetched data into input fields
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.click();
        firstName.sendKeys(resultFname);

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.click();
        lastName.sendKeys(resultLname);

        // Scrolling down and entering text into the textarea
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0 , 300)", "");
        WebElement textBox = driver.findElement(By.xpath("//*[@id='form-textfield']/textarea"));
        textBox.click();
        textBox.sendKeys("Correctly fetched data entered above");
        System.out.println("First name, last name, and text box entered with fetched data");

        // Close the browser
        driver.quit();
    }
}
