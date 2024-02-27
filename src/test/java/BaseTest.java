import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	private Object driver;

	@BeforeTest
	public void setup()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

	}
	@AfterTest
	public void closeBrowser()
	{
		WebDriver driver = new ChromeDriver();
		driver.quit();

	}
}