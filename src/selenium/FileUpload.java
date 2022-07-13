package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {


	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RaghuFriend/Desktop/html/fileupload.html");
		Thread.sleep(2000);
	WebElement fileButton = driver.findElement(By.id("a1"));
	
	File f1 = new File("./cv/shashiResume.pdf");
	String absPath=f1.getAbsolutePath();
	Thread.sleep(2000);
	System.out.println(absPath);
	Thread.sleep(2000);
	fileButton.sendKeys(absPath);
	Thread.sleep(2000);
	driver.close();
	
	
		
	}

}
