package com.pomacademy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomacademy.qa.base.TestBase;

public class MyAccountPage extends TestBase{

	//Page Factory - OR:
	@FindBy(xpath="//*[@id=\"headerForScroll\"]/nav[1]/div/div/div[1]/div/div/a/img")
	static
	WebElement logo;
	
	@FindBy(id="signIn-emailInput")
	static
	WebElement EmailInput;
	
	@FindBy(id="signIn-password")
	static
	WebElement Emailpwd;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/button")
	static
	WebElement SignIn;
	
	@FindBy(linkText="Sign Up")
	static
	WebElement SignUp;
	
	//Initializing the page Objects
		public MyAccountPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public static String validateMyAccountPageTitle()
		{
			return driver.getTitle();
		}
		
		public static boolean validateMyAccountLogo()
		{
			return logo.isDisplayed();
		}
		
		public static void enteremailpwd()
		{
			EmailInput.sendKeys("sengraphics@gmail.com");
			Emailpwd.sendKeys("Test_123$");
			
		}
				
		public static SignUpPage AccessSignUpPage()
		{
			SignUp.click();
			return new SignUpPage();
		}
		
		
	
}
