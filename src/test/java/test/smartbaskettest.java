package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.smartbasket;

public class smartbaskettest {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		smartbasket sb=new smartbasket(driver);
		sb.click();
		Thread.sleep(1000);
		WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.bigbasket.com/pd/10000067/fresho-capsicum-green-1-kg/?t_s=Capsicum+-+Green+%2528Loose%2529");
		sb.click2();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)","");
		Thread.sleep(1000);
		WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.bigbasket.com/pd/10000070/fresho-carrot-orange-1-kg/?nc=Frequently+Bought+Together&t_pos_sec=4&t_pos_item=2&t_s=Carrot+-+Orange+%2528Loose%2529");
		sb.click4();
		driver.navigate().refresh();
		Thread.sleep(1000);
		sb.cart();
		driver.navigate().refresh();
		//title verification
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="bigbasket";
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("pass");
		}
		else
		{ System.out.println("fail");
		}
		//logo verification
		WebElement sc=driver.findElement(By.xpath("/html/body/div[2]/div[1]/header[2]/div[1]/div[1]/a"));
				boolean b=sc.isDisplayed();
		if(b)
		{
			System.out.println("pass");
		}
		else
		{
	 System.out.println("fail");
		}
		//content check
		String actualsource=driver.getPageSource();
		String expected1="ayurveda";
		if(actualsource.contains(expected1))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		}
	}
