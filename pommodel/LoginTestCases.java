package pommodel;

import javax.swing.LayoutFocusTraversalPolicy;

import org.openqa.selenium.By;

public class LoginTestCases {
	
	void valid_user_valid_pass() throws InterruptedException
	{
		LoginPage lPage = new LoginPage();
		lPage.Load();
		lPage.usernamElement.sendKeys("standard_user");
		lPage.pwsElement.sendKeys("secret_sauce");
		lPage.loginbuElement.click();
		Thread.sleep(3000);
		BaseClass.driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		BaseClass.driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(3000);
		BaseClass.driver.close();
		
		
	}
	
	void invalid_user_valid_pass() throws InterruptedException
	{
		LoginPage lPage = new LoginPage();
		lPage.Load();
		Thread.sleep(3000);
		lPage.usernamElement.sendKeys("standard");
		lPage.pwsElement.sendKeys("secret_sauce");
		lPage.loginbuElement.click();
		lPage.usernamElement.clear();
		lPage.pwsElement.clear();
		BaseClass.driver.close();
		
		
	}
	
	
	void invalid_user_invalid_pass()
	{
		LoginPage lPage = new LoginPage();
		lPage.Load();
		lPage.usernamElement.sendKeys("standard");
		lPage.pwsElement.sendKeys("secret");
		lPage.loginbuElement.click();
		lPage.usernamElement.clear();
		lPage.pwsElement.clear();
		BaseClass.driver.close();
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		LoginTestCases lTestCases = new LoginTestCases();
		lTestCases.valid_user_valid_pass();
		lTestCases.invalid_user_valid_pass();
		lTestCases.invalid_user_invalid_pass();
	}

}
