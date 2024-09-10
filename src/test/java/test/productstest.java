package test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.products;

public class productstest {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();	
}
@BeforeMethod
public void url()
{
driver.get("https://www.bigbasket.com/member/sb/?nc=b-header-2-tile&b_t=Header-2-Tile&b_camp=smart_basket-250124-1");
}
@Test
public void test() throws IOException
{
products pp=new products(driver);
pp.click();
WebElement wb=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[2]/div[1]/div[4]/div/div[1]/div[1]/a/span/img"));
File screenshots=wb.getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshots, new File("./scrnprjct//project.png"));
pp.arrow();
WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(30));
Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[2]/div[1]/div/div/div[1]/ul/li[4]/div/a/div")));
pp.choco();
WebDriverWait Wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"siteLayout\"]/div[5]/div[2]/section[2]/section/ul/li[1]/div/div/h3/a/div")));
pp.kat();
//WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
//driver.get("https://www.bigbasket.com/pd/40122231/nestle-kitkat-share-bag-2-fingers-pack-119-g/?nc=l3category&t_pos_sec=1&t_pos_item=1&t_s=Kitkat+Minis+Chocolate+Coated+Wafer+Bar+-+Share+Bag");
URL nw=new URL("https://www.bigbasket.com/pc/snacks-branded-foods/chocolates-candies/chocolates/");
HttpURLConnection con=(HttpURLConnection)nw.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
	System.out.println("valid url");
}
else
{
	System.out.println("invalid url");
}
}
}
