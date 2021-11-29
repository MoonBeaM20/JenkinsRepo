package com.testcase;

import org.testng.Assert;
import org.testng.annotations.*;

import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class loginpagetest extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	public loginpagetest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		super.initialize();
		loginPage = new LoginPage();
	}
	
	@Parameters({"user", "pass"})
	@Test
	public void test1(String user, String pass) {
		dashboardPage = loginPage.validateLogin(user, pass);
		Assert.assertTrue(dashboardPage != null);
	}
}
