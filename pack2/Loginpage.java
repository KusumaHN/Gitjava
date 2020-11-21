package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
