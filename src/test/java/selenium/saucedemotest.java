package selenium;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saucedemotest {
	static WebDriver driver;
	//setup
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adam Stevenson\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Tester\\src\\main\\resources\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		
		
	}

}
