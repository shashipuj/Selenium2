package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBox {


	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RaghuFriend/Desktop/listbox.html");
	WebElement tagEle = driver.findElement(By.id("taj"));
		Select s1=new Select(tagEle);
		s1.selectByIndex(0);
		s1.selectByValue("cb");
		s1.selectByVisibleText("HALWA");
		Thread.sleep(2000);
		
		List<WebElement> allSelected = s1.getAllSelectedOptions();
		for(int i=0;i<allSelected.size();i++)
		{
			System.out.println("All selected options "+ allSelected.get(i).getText());
		}
		
		WebElement first = s1.getFirstSelectedOption();
		System.out.println("First selected options "+ first.getText());
		List<WebElement> allOpt = s1.getOptions();
		
		for(int i=0;i<allOpt.size();i++)
		{
			System.out.println("All  options "+ allOpt.get(i).getText());
		}
		WebElement allEle = s1.getWrappedElement();
		System.out.println("Wrapped options "+ allEle.getText());
		System.out.println(s1.isMultiple());
		Thread.sleep(2000);
		s1.deselectByValue("hl");
		s1.deselectByIndex(1);
		Thread.sleep(2000);
		
		
		
		driver.close();

	}

}
