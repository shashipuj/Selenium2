package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.google.com");
	 Alert al = driver.switchTo().alert();
	 System.out.println(al.getText());
	 al.accept();
	 Thread.sleep(3000);
	 driver.close();
	
	}

}
