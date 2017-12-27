package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class InvalidLogin extends BaseTest{
	@Test(priority=2,groups={"login"})
	public void testInvalidLogin() {
		int rc=XL.getRowCount(XL_PATH, "InvalidLogin");
		for(int i=1;i<=rc;i++) {
		String un=XL.getCellValue(XL_PATH,"InvalidLogin",i,0);
		String pw=XL.getCellValue(XL_PATH,"InvalidLogin",i,1);
		//Enter invalid User Name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter invalid Password
		l.setPassword(pw);
		//Click login
		l.clickLogin();
		//verify Err Msg Is Displayed
		l.verifyErrMsgIsDisplayed(driver);
		}
	}
}
