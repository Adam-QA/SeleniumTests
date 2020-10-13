package selenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class shoppingtest {
	static WebDriver driver;
	//setup
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adam Stevenson\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Tester\\src\\main\\resources\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		
	}
	//test
	@Test
	public void test() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(500);
		WebElement dresses = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
		dresses.click();
		Thread.sleep(5000);
		
		WebElement dress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
		dress.click();
		
		WebElement founddress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1"));
		assertEquals("Printed Dress", founddress.getText());
	}
	//close test
	@AfterClass
	public static void close() {
		driver.quit();
		
		
	}

}