
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BaseTest;
import generic.XL;

public class LoginPage extends BaseTest{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="(//div[@id='addTaskButtonId'])/child::div[2]")
	private WebElement user;
	
	@FindBy(xpath="(//div[@class='selectedItem'])[5]")
	private WebElement selectedItem;
	
	@FindBy(xpath="//div[.='- New Customer -']")
	private WebElement cust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement custName;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement projName;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]']")
	private WebElement taskName;
	
	@FindBy(xpath="(//input[@placeholder='not needed'])[1]")
	private WebElement etName;
	
	String un=XL.getData(XL_PATH, "ValidLogin", 1, 0);
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName() {
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLogi() {
		loginBTN.click();
	}
	public void verifyErrMsgDisplayed() {
//		boolean actual=errMsg.isDisplayed();
//		Assert.assertEquals(actual, true);
		//Instead of above line
//		boolean actual=errMsg.isDisplayed();
//		Assert.assertTrue(true);
		//Instead of writting these 2 lines we can write it as below
		Assert.assertTrue(errMsg.isDisplayed());
	}

	public void user() throws InterruptedException {
	user.click();
	selectedItem.click();
	cust.click();
	Thread.sleep(1000);
		
	}

	public void setCustName(String cn) {
		custName.sendKeys(cn);
		
	}

	public void setProjName(String pn) {
		
		projName.sendKeys(pn);
	}

	public void setTaskName(String tn) {
		taskName.sendKeys(tn);
		
	}

	public void setEtName(String et) {
		etName.sendKeys(et);
	}

	
}