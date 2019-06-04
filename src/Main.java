

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(MyTest.class);
		System.out.println("MyTest");
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		///
		System.out.println("FixtureTest");
		Result fixtureTestResult = JUnitCore.runClasses(MyFixtureTest.class);
		for (Failure failure : fixtureTestResult.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(fixtureTestResult.wasSuccessful());
	}
}
