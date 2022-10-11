package reRuns;

//import org.testng.annotations.Ignore;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import org.junit.Test;

public class Test1 {

	@Test(groups="A")
	public void tc1() {
		System.out.println("tc1");
	}
	@Test(groups="B")
	public void tc2() {
		System.out.println("tc2");
	}
	
	@Test(groups="C")
	public void tc3() {
		System.out.println("tc3");
	}

}
