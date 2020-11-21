package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties pr;
	
	
    public BaseClass() throws IOException
{
	pr=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\Config\\config.properties");
	pr.load(fis);
}
 
	public void Init()
	{
		String browsername=pr.getProperty("browser");
		if(browsername.equalsIgnoreCase("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(pr.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		
	}
  }
	
	
	
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
