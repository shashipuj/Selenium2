package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg1 {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://www.cleartrip.com");
	driver.findElement(By.xpath("//input[@placeholder='Any worldwide city or airport'][1]")).sendKeys("ban");
	 List<WebElement> ele =driver.findElements(By.xpath("//p[contains(.,'Ban')]"));
	 System.out.println(ele.size());
	for (int i=0;i<ele.size();i++)
	{
		System.out.println(ele.get(i).getText());
	}

	ele.get(0).click();
	Thread.sleep(2000);
	driver.close();
	}

}
