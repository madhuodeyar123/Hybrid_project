package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pmclasses.Loginpagepom;

public class LoginPageTest extends BaseClass {
	
     //Loginpagepom loginPagePom = new Loginpagepom();
     BaseClass baseclass= new BaseClass();
	
     
    @BeforeClass
	public void setup()
	{
		baseclass.launchwebsite();
	}
	
   @AfterClass
	public void teardown()
	{
		//driver.close();
	}
    
	@Test
	public void testTitle()
	{
		String webTitle =driver.getTitle();
		System.out.println(webTitle);
		Assert.assertEquals(webTitle, "OrangeHRM");
	}
	@Test
	public void loginTest()
	{
		Loginpagepom loginPagePom = new Loginpagepom();
		String username= loginPagePom.getusername();
		String password=loginPagePom.getpassword();
		Assert.assertEquals(username, "Admin");
		Assert.assertEquals(password, "admin123");
		loginPagePom.setUsername(username);
		loginPagePom.setPassword(password);
		loginPagePom.login();
		
	}
	
	
}
