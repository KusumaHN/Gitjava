package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBtn;
	
	LoginPage(WebDriver driver)
	{
		unTB = driver.findElement(By.xpath("//input[@id='username']"));
		pwTB = driver.findElement(By.xpath("//input[@name='pwd']"));
		loginBtn = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	public void setun(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setpw(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}

}
