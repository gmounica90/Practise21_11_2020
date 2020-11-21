package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseClass;

public class LoginPage extends BaseClass{

	
	@FindBy(xpath="//input[@id='login_id']")
	WebElement loginid;
	
	@FindBy(xpath="//button[@id='nextbtn']")
	WebElement nextbtn;
	
	
    public LoginPage() throws IOException {
	 PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	public SiginPage login2() throws IOException
	{
		loginid.sendKeys(pr.getProperty("login"));
		nextbtn.click();
		return new SiginPage();
	}
  
	public void titlevalidation() {
		
		String expected_val="Sign in with password";
		String Actual_val=driver.getTitle();
		Assert.assertEquals(Actual_val, expected_val);
		System.out.println("we have landed to signin page");	
	}

}
