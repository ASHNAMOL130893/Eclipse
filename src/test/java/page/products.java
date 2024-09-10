package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class products {
WebDriver driver;
By bbfood=By.xpath("//*[@id=\"siteLayout\"]/div/div[3]/div[1]/div/div/ul/li[7]");
By bbarrow=By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[2]/div[1]/button");
By choc=By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[2]/div[1]/div/div/div[1]/ul/li[4]/div/a/div");
By ckat=By.xpath("//*[@id=\"siteLayout\"]/div[5]/div[2]/section[2]/section/ul/li[1]/div/div/h3/a/div");
//By bbadd=By.xpath("//*[@id=\"siteLayout\"]/div/div/section[1]/div[2]/section[2]/div/div[1]/div");
public products(WebDriver driver)
{
this.driver=driver;
}
public void click()
{
driver.findElement(bbfood).click();
}
public void arrow()
{
driver.findElement(bbarrow).click();	
}
public void choco()
{
driver.findElement(choc).click();
}
public void kat()
{
driver.findElement(ckat).click();	
}
/*public void add()
{
driver.findElement(bbadd).click();	
}*/
}
