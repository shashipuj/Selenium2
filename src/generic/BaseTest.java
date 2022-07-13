

package generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		driver.get(APP_URL);
	}
	@AfterMethod
	public void closeApp(ITestResult iTestResult) {
		int status=iTestResult.getStatus();
		String name=iTestResult.getName();
		if(status==1) {
			Reporter.log("Test "+name+" is PASS",true);
		}
		else {
			Reporter.log("Test "+name+" is FAIL/SKIP",true);
			AutoLib.getPhoto(driver,IMG_PATH+name+".png");			
		}
		driver.close();
	}
}