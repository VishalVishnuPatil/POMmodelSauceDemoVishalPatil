package pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	protected BaseClass()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");//112 chromedriver
		driver= new ChromeDriver();
	}
	

	
}