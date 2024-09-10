package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smartbasket
{
WebDriver driver;
By bbimage=By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[3]/a[1]/img");
By bbbaby=By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[1]/div/div");
By bbadd=By.xpath("/html/body/div[2]/div[1]/div/div/section[1]/div[2]/section[2]/div/div[1]/div/button");
By carrot=By.xpath("//*[@id=\"siteLayout\"]/div/div/div[4]/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/div/div/h3/a/div");
By acar=By.xpath("//*[@id=\"siteLayout\"]/div/div/section[1]/div[2]/section[2]/div/div[1]/div/button");
By cart=By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[2]/div[2]/div");
public smartbasket(WebDriver driver)
{
	this.driver=driver;
	}
public void click()
{
driver.findElement(bbimage).click();	
}
public void click1()
{
driver.findElement(bbbaby).click();
}
public void click2()
{
driver.findElement(bbadd).click();	
}
public void car()
{
driver.findElement(carrot).click();	
}
public void click4()
{
driver.findElement(acar).click();	
}
public void cart()
{
driver.findElement(cart).click();	
}
}
