package reRuns;

import org.testng.annotations.Test;

//import org.junit.Test;

public class Test2 {

	@Test(groups="B")
	public void tc10() {
		System.out.println("tc10");
	}
	@Test(groups="A")
	public void tc20() {
		System.out.println("tc20");
	}
	@Test(groups="C")
	public void tc30() {
		System.out.println("tc30");
	}
}
