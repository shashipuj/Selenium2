

package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testValidLogin() throws InterruptedException {
		
		
		String un=XL.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw=XL.getData(XL_PATH, "ValidLogin", 1, 1);
		String title=XL.getData(XL_PATH, "ValidLogin", 1, 2);
		
		
		String cn=XL.getData(XL_PATH, "CustDetails", 1, 0);
		String pn=XL.getData(XL_PATH, "CustDetails", 1, 1);
		String tn=XL.getData(XL_PATH, "CustDetails", 1, 2);
		String et=XL.getData(XL_PATH, "CustDetails", 1, 3);
		
		//Enter valid username
		LoginPage l=new LoginPage(driver);
		l.setUserName();
		
		//Enter valid password
		l.setPassword(pw);
		
		//click on login button
		l.clickLogi();
		
		l.user();
		l.setCustName(cn);
		l.setProjName(pn);
		l.setTaskName(tn);
		
		l.setEtName(et);
		Thread.sleep(5000);
		
		//verify home page is displayed
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyHomePageIsDisplayed(driver, ETO, title);
	}

}