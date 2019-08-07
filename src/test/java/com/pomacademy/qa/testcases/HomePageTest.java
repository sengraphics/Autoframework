package com.pomacademy.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pomacademy.qa.base.TestBase;
import com.pomacademy.qa.pages.HomePage;
import com.pomacademy.qa.pages.MyAccountPage;
import com.pomacademy.qa.pages.SearchPage;
import com.pomacademy.qa.util.TestUtil;

public class HomePageTest extends TestBase
{

	String sheetName = "SearchKeywords";
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		HomePage Homepage = new HomePage();
				
	}
	
	@Test (priority=1)
	public void HomePageTitleTest()
	{
		String title = HomePage.validateHomePageTitle();
		Assert.assertEquals(title, "Academy Sports + Outdoors | Quality Sporting Goods | Top Hunting, Fishing & Outdoor Gear");
	}
	
	
	@Test (priority=2)
	public void AcademyLogoTest()
	{
		Boolean flag = HomePage.validateLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test (priority=3)
	public void MyAccontLinkTest()
	{
		HomePage.AccessMyAccount();
		
	}
	
	@Test (priority=4)
	public void KeywordSearchTest()
	{
		HomePage.searchKeyword();
	}
	
	
	@DataProvider
	public Object[][] getTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test (priority=5, dataProvider="getTestData")
	public void MultipleKeyWordsSearch(String serchkeywords)
	{
		//HomePage.SearchText.sendKeys("Pants");
		HomePage.SearchText.sendKeys(serchkeywords);
		HomePage.SearchIcon.click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
