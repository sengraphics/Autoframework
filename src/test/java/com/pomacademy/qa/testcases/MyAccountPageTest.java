package com.pomacademy.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pomacademy.qa.base.TestBase;
import com.pomacademy.qa.pages.HomePage;
import com.pomacademy.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase
{
	public MyAccountPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		MyAccountPage MyAccountPage = new MyAccountPage();
		HomePage Homepage = new HomePage();
		HomePage.AccessMyAccount();
		
	}
	
	@Test (priority=1)
	public void MyAccountPageTitleTest()
	{
		String title = MyAccountPage.validateMyAccountPageTitle();
		Assert.assertEquals(title, "Sign On | Academy");
	}
	
	
	@Test (priority=2)
	public void AcademyLogoTest()
	{
		Boolean flag = MyAccountPage.validateMyAccountLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test (priority=3)
	public void EnterEmailPwdTest()
	{
		MyAccountPage.enteremailpwd();
	}
	
	@Test (priority=4)
	public void AccessSignUpPageTest()
	{
		MyAccountPage.AccessSignUpPage();
		
	}
	
		
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
