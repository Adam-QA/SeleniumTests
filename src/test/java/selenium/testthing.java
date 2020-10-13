package selenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testthing {
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
		driver.get("http://thedemosite.co.uk/");
		Thread.sleep(500);
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		searchBar.click();
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.sendKeys("test");
		WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.sendKeys("test");
		WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		submit.submit();
		
		WebElement loginbar = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginbar.click();
		
		WebElement username1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		username1.sendKeys("test");
		WebElement password1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		password1.sendKeys("test");
		WebElement submit1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		submit1.click();
		Thread.sleep(5000);
		
		WebElement success = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", success.getText());
	}
	//close test
	@AfterClass
	public static void close() {
		driver.quit();
		
		
	}

}
