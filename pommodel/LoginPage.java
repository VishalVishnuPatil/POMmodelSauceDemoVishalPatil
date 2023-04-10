package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass{
	
public static	 WebElement  logoElement;
public static	 WebElement imagElement;
public static	 WebElement usernamElement;
public static	 WebElement pwsElement;
public static	 WebElement loginbuElement;
	 
	public static void Load() {
		driver.get("https://www.saucedemo.com/");
	//	logoElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));//div[@class='login_logo']
		//imagElement= driver.findElement(By.xpath("//div[@class='bot_column']"));
		usernamElement= driver.findElement(By.xpath("//input[@id='user-name']"));
		pwsElement= driver.findElement(By.xpath("//input[@id='password']"));
		loginbuElement= driver.findElement(By.xpath("//input[@id='login-button']"));
	}

}