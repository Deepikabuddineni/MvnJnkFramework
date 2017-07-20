package com.fanniemae.testcases;





import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fanniemae.base.TestBase;

public class SDET_Login_Testcase extends TestBase{
	
	
@Test
public void tc_loginTestCase(){
	click("xpath_LoginBtn");
	type("xpath User","FM-SDET");
	type("id_pwd","Hexaware");
	click ("id_bottomLoginbutton");
	Assert.assertEquals("","");
	
	
	
}
	
	


@Test(enabled =false)
public void tc_NewAccountTestCase(){
}
	

}
