package reRuns;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Test1.class,Test2.class,Test3.class})
public class TestRunner {
	@org.testng.annotations.Test
	public void sample() {
		Result runClasses = JUnitCore.runClasses(Test1.class,Test2.class,Test3.class,MouseHover1.class);
		int runCount = runClasses.getRunCount();
		System.out.println("Run Count: "+runCount);
		long runTime = runClasses.getRunTime();
		System.out.println("Run Time: "+runTime);
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Ignore Count: "+ignoreCount);
		int failureCount = runClasses.getFailureCount();
		System.out.println("Failure Count: "+failureCount);
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			System.err.println("Failures"+failure);
		}

		
	}
}
