package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RaghuFriend/Desktop/listbox.html");
		 WebElement obe = driver.findElement(By.id("ob"));
		Select s1 = new Select(obe);
		System.out.println(s1.isMultiple());
		s1.selectByIndex(3);
	//	s1.deselectByIndex(3);
		driver.close();
		

	}

}
