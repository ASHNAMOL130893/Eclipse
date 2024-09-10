package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.homepage;

public class homepagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.bigbasket.com/");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		homepage hp=new homepage(driver);
		hp.login();
		Thread.sleep(1000);
        hp.setvalues("8943558707");
        hp.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        hp.location();
	    hp.kochi("ernakulam");
        hp.south();
        
	}

}
