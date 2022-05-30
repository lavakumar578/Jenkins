package com.jenkinsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	public class TestNgAssertTest{

		
		@Test
		public void practice1Test()
		{
			Reporter.log("a-practice1",true);
			Reporter.log("b-practice1",true);
			Reporter.log("c-practice1",true);
			Reporter.log("d-practice1",true);
			Reporter.log("e-practice1",true);
			Reporter.log("f-practice1",true);
		
		}
		
}
}