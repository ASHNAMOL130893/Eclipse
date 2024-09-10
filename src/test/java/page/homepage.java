package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDriver driver;
	By bblogin=By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[2]/div[2]/button");
	By bbmobnum=By.xpath("//*[@id=\"multiform\"]");
	By bbcontinue=By.xpath("/html/body/div[6]/div/div/div/div/div/div/div[2]/form/button");	
	By location=By.xpath("//*[@id=\"headlessui-menu-button-:r1:\"]");
	By bbkochi=By.xpath("/html/body/div[2]/div[1]/header[2]/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/input");
	By south=By.xpath("//*[@id=\"headlessui-menu-items-:r4:\"]/div[3]/ul/li[1]");
	public homepage(WebDriver driver)
	{
	
	this.driver=driver;	
	}
	public void login()
	{
		driver.findElement(bblogin).click();
	}
	public void setvalues(String mobnum)
	{
		driver.findElement(bbmobnum).sendKeys(mobnum);
	}
	public void click()
	{
		driver.findElement(bbcontinue).click();
		driver.navigate().refresh();
		}
	public void location()
	{
		driver.findElement(location).click();
	}
	public void kochi(String place)
	{
		driver.findElement(bbkochi).sendKeys(place);
	}
	public void south()
	{
		driver.findElement(south).click();
	}

}
