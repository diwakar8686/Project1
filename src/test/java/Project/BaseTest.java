package Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.*;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseTest {
	    protected WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.tradingview.com/chart/");
	    }

	    @AfterClass(alwaysRun = true)
	    public void teardown() {
	        if (driver != null) driver.quit();
	    }
	}


