package Axis.BCG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Do {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the To-Do List page
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Find the input field to add new todo items
        WebElement AddNewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));

        // Move to the AddNewTodo element and perform the action
        actions.moveToElement(AddNewTodo).perform();

        // Add a new todo item "Gym"
        AddNewTodo.sendKeys("Gym");
        AddNewTodo.sendKeys(Keys.ENTER);
        System.out.println("Gym added");

        // Add a new todo item "Family Function"
        AddNewTodo.sendKeys("Family Function");
        AddNewTodo.sendKeys(Keys.ENTER);
        System.out.println("Family Function added");

        // Find and delete the "Practice Magic" todo item
        WebElement Delpracticemagic =
        driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[3]/span/i"));
        actions.moveToElement(Delpracticemagic).perform();
        Delpracticemagic.click();
        System.out.println("Practice Magic Deleted");

        // Find and click the Plus icon to hide the Add To Do element
        WebElement Plusicon = driver.findElement(By.xpath("//i[@id='plus-icon']"));
        actions.moveToElement(Plusicon).perform();
        Plusicon.click();
        System.out.println("Clicked on Plus icon and hide add to do element");

        // Close the browser
        driver.quit();
    }
}
