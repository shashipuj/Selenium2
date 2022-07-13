package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		//driver.get("http://localhost:8080/crm/HomePage.do");
		String untbSelector ="input[placeholder='Username']";

				
				

	}

}
