package com.automate;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class WebAutoRunner {

	public static void main(String[] args) {
		
		TestNG testng = new TestNG();
	    List<String> suites = Lists.newArrayList();
	    suites.add("D:\\BNP\\ProjectsAlias\\SeleniumTestNG\\testng.xml");//path to xml..
	    testng.setTestSuites(suites);
	    testng.run();
		
	}

}
