package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class CheckProductVersion extends BaseTest {
@Test(priority=3,groups= {"version"})
public void testProductVersion() {
	String sheet="CheckProductVersion";
	String un=XL.getCellValue(XL_PATH,sheet,1,0);
	String pw=XL.getCellValue(XL_PATH,sheet,1,1);
	String eVersion=XL.getCellValue(XL_PATH,sheet,1,2);

	//Enter valid User Name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter valid Password
	l.setPassword(pw);
	//Click on Login
	l.clickLogin();
	//Click on Help
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.clickHelp();
	//Click on About ActiTIME
	e.clickAboutActiTIME();
	//Verify Product Version
	e.verifyVersion(eVersion);
	//Click on Close Button
	e.clickCloseButton();
	//Click on logout
	e.clickLogout();
}
}
