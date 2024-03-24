package com.pmclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;

public class Loginpagepom  extends BaseClass {
	
	public Loginpagepom() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//p[text()='Username : Admin']")
	 private WebElement username;
	
	
	 @FindBy(xpath = "//p[text()='Password : admin123']")
	  private WebElement password;
	
	
	 @FindBy(xpath = "//input[@name='username']") 
	 private WebElement inputuser;
	
	
	@FindBy(xpath = "//input[@name='password']")
	 private WebElement inputpassword;
	
	 
	 @FindBy(xpath = "//button[@type='submit']")
	 private WebElement submitButton;
	 
	  
	  @FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	 private WebElement homepagelink;
	 
	 public String getusername()
	 {
		 String origianal = username.getText();
		String  username=origianal.substring(origianal.indexOf('A'));
		
		return username;
		 }
	
	 public String getpassword()
	 {
		 String original = password.getText();
		 String password=original.substring(original.lastIndexOf('a'));
		 
		 return password;
	 }
	 
     public void setUsername(String username)
     {
    	 inputuser.sendKeys(username);
    	 
     }
     
     public void setPassword(String password)
     {
    	 inputpassword.sendKeys(password);
     }
     
     public void login()
     {
    	 submitButton.click();
     }
     
     
}
