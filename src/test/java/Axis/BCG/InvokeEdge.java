package Axis.BCG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ashwi\\Downloads\\edge\\msedgedriver.exe");

		
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.selenium.dev");
}
}