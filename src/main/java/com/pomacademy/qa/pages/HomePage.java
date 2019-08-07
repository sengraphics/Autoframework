package com.pomacademy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pomacademy.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page Factory - OR:
		
	@FindBy(xpath="//*[@id=\"headerForScroll\"]/nav[1]/div/div/div[1]/div/div/a/img")
	static
	WebElement logo;
	
	@FindBy(linkText="My Account")
	static
	WebElement MyAccountLink;
	
	@FindBy(id="gcHackD")
	WebElement giftcardLink;
	
	@FindBy(id="search")
	public static
	WebElement SearchText;
	
	@FindBy(xpath="//*[@id=\"headerForScroll\"]/nav[1]/div/div/div[2]/div[2]/ul/li[3]/div/form/button[2]/span")
	public static
	WebElement SearchIcon;
	
	//Initializing the page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public static String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public static boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public static SearchPage searchKeyword()
	{
		SearchText.sendKeys("shirt");
		SearchIcon.click();
		return new SearchPage();
	}
	
	public static MyAccountPage AccessMyAccount()
	{
		MyAccountLink.click();
		return new MyAccountPage();
	}
	
}
