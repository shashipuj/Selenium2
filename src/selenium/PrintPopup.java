package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	

	static
	{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_P);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	for(int i=0;i<7;i++)
	{
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(200);
		
	}
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	driver.close();
		
		

	}

}
