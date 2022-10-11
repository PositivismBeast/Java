package reRuns;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups="C")
	public void tc100() {
		System.out.println("tc100");
	}
	@Test(groups="B")
	public void tc200() {
		System.out.println("tc200");
	}
	@Test(groups="A")
	public void tc300() {
		System.out.println("tc300");
	}

}
