
package generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AutoLib {
	
	public static void getPhoto(WebDriver driver,String path) {
		TakesScreenshot t =(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(path);
		try {
			FileUtils.copyFile(srcFile, destFile);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}