package test;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class TC_001 extends BaseClass {
	@Test
	public void test1() {
		HomePage hp = new HomePage(driver);

		try {
			hp.getLink();
		} catch (StaleElementReferenceException e) {

		} catch (TimeoutException e) {

		}
	}

	@Test
	public void test2() {
		HomePage hp = new HomePage(driver);

		try {
			hp.getHeader();
		} catch (StaleElementReferenceException e) {

		} catch (TimeoutException e) {

		}
	}

	@Test
	public void test() {
		HomePage hp = new HomePage(driver);
		hp.getDescription();
	}
}
