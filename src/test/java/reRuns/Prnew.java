package reRuns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prnew extends Base {
	

//	@Parameters({"email","pass"})
	
	@Test(dataProvider="login")
	public void Tc2(String txtmail,String txtPass) {
		getUrlByChrome("https:/facebook.com");
//		openOpera();
//		getUrl("https:/facebook.com");
		WebElement mtxt = locateById("email");
//		sendKeys(locateById("email"), txtmail);
		mtxt.sendKeys(txtmail);
		WebElement ptxt = locateById("pass");
		ptxt.sendKeys(txtPass);
//		locateByName("login").click();
	
	}
	
	@DataProvider(name="login")
	private Object[][] data(){
		return new Object[][] {
			{"prabha123@gmail.com","1111111"},
			{"ooooooooo@gmail.com","ooooooo"},
			{"poiuytrrewqq","222222222"},
			{"qqqqqqqqqqqq","hhhhhhhhh"}
		};

	}
}
