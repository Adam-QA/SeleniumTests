package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FTSE {
	static WebDriver driver;
	//setup
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adam Stevenson\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Tester\\src\\main\\resources\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		
		
	}
	//test
	
	@Test
	public void test() throws InterruptedException {
		
		List<WebElement> targList;
		List<String> targListText = new ArrayList<String>();
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Thread.sleep(5000);
		WebElement risers = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[2]/a"));
		risers.click();
		Thread.sleep(5000);
		
		targList = driver.findElements(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr/*"));
		for(WebElement targ : targList) {
			String text = targ.getText();
//			System.out.println(targ.getText());
			targListText.add(text);
			
			
		}
		List<Double> listI = new ArrayList<>();
		
		for(int i = 0; i < targListText.size(); i++) {
			if(i % 6 == 4) {
				String targListTextI = targListText.get(i);
				targListTextI = targListTextI.replace("+", "");
				targListTextI = targListTextI.replace("%", "");
//				System.out.println(targListText.get(i));
				listI.add(Double.parseDouble(targListTextI));
				
			}
			
		}
		Double max = Collections.max(listI);
		System.out.println(max);
		assertTrue(max > 0);
//		System.out.println(targListText);
		
		
		
		
//		targList = driver.findElements(By.xpath("/html/body"));
//		System.out.println(targList);
		
		
	}
	//close test
	@AfterClass
	public static void close() {
		driver.close();
		
		
	}

}