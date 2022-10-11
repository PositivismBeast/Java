package reRuns;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parmeter extends Base {

	@Parameters({ "mail1", "password1" })

	@Test
	public void Tc1(String txtmail, String txtPass) {
		getUrlByChrome("https:/facebook.com");
		WebElement mtxt = locateById("email");
		mtxt.sendKeys(txtmail);
		WebElement ptxt = locateById("pass");
		ptxt.sendKeys(txtPass);
		// locateByName("login").click();
	}

	@Parameters({ "hi", "hello" })
	@Test
	public void Tc3(String txt, String Pass) {
		getUrlByChrome("https:/facebook.com");
		// openOpera();
		// getUrl("https:/facebook.com");
		WebElement mt = locateById("email");
		// sendKeys(locateById("email"), txtmail);
		mt.sendKeys(txt);
		WebElement pt = locateById("pass");
		pt.sendKeys(Pass);
		// locateByName("login").click();
	}

}
