package reRuns;

import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Test;

//import org.junit.Test;
//import org.openqa.selenium.WebElement;

public class MouseHover1 {

	@Test(priority=1)
	public void tc1() {
		System.out.println("tc1");
		System.out.println(1);
		Assert.assertTrue(false);
		System.out.println(2);
		System.out.println(3);
	}

	@Test(priority=0)
	public void tc2() {
		System.out.println("tc2");
	}

	@Test(priority=2,retryAnalyzer=ManualRerun.class)
	public void tc3() {
		System.out.println("tc3");
		System.out.println(1);
		Assert.assertTrue(false);
		System.out.println();

		// // MouseHover a = new MouseHover();
		// getUrlByChrome("https://www.flipkart.com/");
		// implicityWait(5);
		// WebElement locateByXpath = locateByXpath("//button[@class='_2KpZ6l
		// _2doB4z']");
		// click(locateByXpath);
		// // WebElement locateByXpath2 = a.locateByXpath("//div[text()='More']");
		// moveToElement(locateByXpath("//div[text()='More']"));
		// WebElement lx = locateByXpath("//div[text()='24x7 Customer Care']");
		// click(lx);
		// // a.selectByVisibleText(locateByXpath2, "24x7 Customer Care");
		// WebElement locateByXpath3 =
		// locateByXpath("//p[contains(text(),'resolution')]");
		//
		// String text = getText(locateByXpath3);
		// System.out.println(text);

	}

}
