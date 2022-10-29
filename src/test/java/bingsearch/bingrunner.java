package bingsearch;

import org.testng.TestNG;

public class bingrunner {

	public static void main(String[] args) {
		TestNG testNg = new TestNG();
		 testNg.setTestClasses(new Class[] {bingtest.class});
			testNg.run();
	}

}
