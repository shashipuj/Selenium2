package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.className("initial")).click();
		//Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@id='addTaskButtonId'])/child::div[2]")).click();
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("(//div[.='Toyota'])[1]")).click();
//		driver.findElement(By.xpath("(//div[@class='selectedItem'])[5]")).click();
////		Thread.sleep(2000);
////		
//		driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
//		Thread.sleep(200);
////		
//		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("Aarvi12");
////	//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("naixin12");
//	
	
	//----------------copy existing property--------------
//	driver.findElement(By.xpath("//div[.='Copy properties from existing tasks']")).click();
//	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@autocorrect=\"off\"])[3]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//td[@class='dropdownButton'])[3]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//td[.='aaru']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//span[.='pinny'])[3]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//span[.='Copy properties']")).click();
//	driver.findElement(By.xpath("//div[.=\"Create Tasks\"]")).click();
//	Thread.sleep(3000);
	
	//------------------CREATING NEW CUSTOMER--------------------
//		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("scout12 details");
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@placeholder='not needed'])[1]")).sendKeys("500");
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[.='set deadline'])[1]")).click();
//	//	Thread.sleep(2000);
//		driver.findElement(By.id("ext-gen89")).click();
//	//	Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[.=\"May\"]")).click();
//	//	Thread.sleep(2000);
//		
//driver.findElement(By.xpath("//button[@class=\"x-date-mp-ok\"]")).click();
////Thread.sleep(2000);
//driver.findElement(By.xpath("(//span[.=\"30\"])[2]")).click();
////Thread.sleep(2000);
//driver.findElement(By.xpath("//div[.=\"Create Tasks\"]")).click();
//Thread.sleep(3000);
//driver.navigate().back();


Thread.sleep(2000);
//----------------DELETING CUSTOMER------------------
//driver.findElement(By.xpath("//div[.='scout12 details']")).click();
//driver.findElement(By.xpath("//div[.='ACTIONS']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[.='Delete']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@class='buttonIcon']")).click();
//Thread.sleep(3000);

//-----------------DOWNLOAD PDF---------------
//driver.findElement(By.xpath("//a[.='View Time-Track']")).click();
//Thread.sleep(100);
//driver.findElement(By.xpath("//td[contains(.,'Export ')]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//span[.='Download PDF']")).click();
//Thread.sleep(3000);



//--------------------EDIT THE COMMENT OF A PARTICULAR TASK--------------------

//driver.findElement(By.xpath("(//img[@title='Click to edit comments'])[11]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//textarea[@wrap='virtual']")).sendKeys("Hello pinny");
//Thread.sleep(2000);
//driver.findElement(By.id("scbutton")).click();
//Thread.sleep(2000);





//------------------------COPY THE TASK TO THE TARGET PROJECT------------------

		driver.close();
		
		

	}

}
