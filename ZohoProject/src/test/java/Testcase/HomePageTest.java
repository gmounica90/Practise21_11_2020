package Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.BaseClass;
import Page.HomePageClass;
import Page.LoginPage;


public class HomePageTest extends BaseClass{

	HomePageClass home;
	
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod() 
	public void setup() throws IOException
	{
		
		Init();
		home=new HomePageClass();
		System.out.println("beforetestok");
		
	}
	
	
	@Test
	public void Customerpage() throws IOException 
	{
		
		home.Customerbtn1();
		System.out.println("object called @test");
	}
	
	/*@Test
	public void lgnpage() throws IOException
	{
		home.login1();
	}*/
		
	/*@AfterTest()
	public void td()
	{
		teardown();
	}*/
	
}
