package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepage {

	final String s1="a";
	@FindBy(tagName =s1)
	private List<WebElement> allLinks;
	
	public Googlepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getlinkscount()
	{
		int count = allLinks.size();
		System.out.println(count);
		
	}
	public void getTextofLinks()
	{
		for(WebElement link : allLinks)
		{
			String text = link.getText();
			String Url=link.getAttribute("href");
			System.out.println(text+"---->"+Url);
		}
		
		
	}
	
}
