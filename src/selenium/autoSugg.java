package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoSugg {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> autoSugg = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println(autoSugg.size());
	Thread.sleep(200);
		for (int i=0;i<autoSugg.size();i++)
		{
			System.out.println(autoSugg.get(i).getText());
		}
		//Thread.sleep(200);
		wait.until(ExpectedConditions.titleContains("java"));
		autoSugg.get(2).click();
		driver.close();
		}
			
		

	}


