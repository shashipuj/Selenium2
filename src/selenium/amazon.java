package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	 List<WebElement> allLINKS = driver.findElements(By.tagName("a"));
	  System.out.println(allLINKS.size());   
	  for(int i=0;i<=allLINKS.size();i++)
	  {
		  System.out.println(allLINKS.get(i).getText());
	  }
	  
		
driver.close();
	}

}
