package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1,groups= {"smoke","login"})
	public void testValidLogin() {
		String un=XL.getCellValue(XL_PATH,"ValidLogin",1,0);
		String pw=XL.getCellValue(XL_PATH,"ValidLogin",1,1);
		String eTitle=XL.getCellValue(XL_PATH,"ValidLogin",1,2);
		//Enter Valid User Name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter Valid Password
		l.setPassword(pw);
		//Click Login
		l.clickLogin();
		//Verify Home Page is Displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(driver,eTitle);
	}
}

/**
 * Note: if Parameter is used in Test Class then we can't run the 
 * Test class directly(we have to send parameter value from testng.xml)
 * 
 * If we run from testng.xml it executes all the Test Classes 
 * 
 * To run single Test class we should make Parameter as Optional
 * Example: 
 * Old code in BaseTest class:
 * public void openApp(String browser)
 * 
 * New Code:
 * public void openApp(@Optional("chrome")String browser)
 */






