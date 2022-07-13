package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selDownload {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(.,'Latest ')]/a")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
