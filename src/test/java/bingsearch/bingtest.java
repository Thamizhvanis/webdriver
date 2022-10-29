package bingsearch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class bingtest {
	
	WebDriver driver;

    @BeforeTest
	public void driversetup() throws Exception {
    	
	    System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");	
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.bing.com/");
		Thread.sleep(4000);
    }

	
	@Test
	public void testcase() throws Exception {
			

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("Intellipaat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='search_icon']")).click();
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		System.out.println("Search result webpage title: " + actualtitle);
	
	}
	
	
}
