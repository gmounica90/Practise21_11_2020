package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePageClass extends BaseClass {

	@FindBy(xpath="//div[@class='zh-user-account']/a[@class='zh-customers']")
	WebElement customerbtn;
	
	@FindBy(xpath="//div[@class='zh-user-account']/a[@class='zh-support']")
	WebElement supportbtn;
	
	@FindBy(xpath="//div[@class='zh-user-account']/a[@class='zh-contact']")
	WebElement contactsalesbtn;
	
	@FindBy(xpath="//div[@class='zh-user-account']/a[@class='zh-login']")
	WebElement loginbtn;

	public HomePageClass() throws IOException 
    {	
	PageFactory.initElements(driver,this);
	System.out.println("entered pagefactory");
	}
	
	
	public void Customerbtn1() {
		customerbtn.click();
	 }
	
	public void support() 
	{
		supportbtn.click();
	}
	
	public void contactsales() 
	{
		contactsalesbtn.click();
		
	}
	
    public LoginPage login1() throws IOException
	{
	    loginbtn.click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
