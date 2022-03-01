package basics;

public class Demo {
	private int id;
	public static String name;

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.name = "Harshit";
		System.out.println(name);
		
		
		/**
		 * JAR FILE :
		 * JAR stands for Java ARchive. It's a file format based on the popular ZIP file format and is used for aggregating many files into one.
		 * 
		 * Selenium WebDriver :
		 * Selenium is a popular open-source web-based automation tool. It's main function is to automate web browsers & web applications.
		 * And, Selenium Webdriver is a tool for automating testing web applications. It directly interacts with different browsers to automate certain web pages and each browser has it's own driver.
		 * For eg : chrome Driver, firefox driver etc.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
==================================================================================================================
		 * 
		 * 
		 * 
		 * 
		 * Implicit Wait :
		 * Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception. 
		 * Once this time is set, WebDriver will wait for the element before the exception occurs.
		 * 
		 * 
		 * Explicit Wait :
		 * By using the Explicit Wait command, the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code.
		 * To use Explicit Wait in test scripts, import the following packages into the script.

			import org.openqa.selenium.support.ui.ExpectedConditions
			import org.openqa.selenium.support.ui.WebDriverWait 
			
		 *Then, Initialize A Wait Object using WebDriverWait Class.

			WebDriverWait wait = new WebDriverWait(driver,30); 
			
		* Difference between xPath and css selector:
		* Xpath allows bidirectional flow which means the traversal can be both ways from parent to child and child to parent as well. 
		* Css allows only one directional flow which means the traversal is from parent to child only.
		*
		*Xpath is slower in terms of performance and speed. 
		*Css has better performance and speed than xpath.
		*
		*
		*TestNG is a testing framework inspired from JUnit but introducing some new functionalities that make it more powerful and easier to use
		*	It contains a lot of extra features and methods and creating an testNG class is a lot more beneficitial than creating a class in jUnit.
		*
		*
		*
		*
		*
====================================================================================================================================	
		*
		*Maven - Build Automation Tool

		Life Cycle of Maven :


1. Maven Compile

		Java, Classes, Code -- Comiple>>>Maven Compiler Plugin

2. Maven Test

		Test-Test Cases-Unit Test Cases, Smoke Test Cases, Functional Test Cases >>Maven Surefire Plugin

3. Maven Resource - Jar,

		JARS/WARS/AERS - Resources >> Maven Resources Plugin (generally not included)
		*
		*
		*Action Class :
		*
		*Actions class is an ability provided by Selenium for handling keyboard and mouse events. 
		*In Selenium WebDriver, handling these events includes operations such as drag and drop, clicking on multiple elements with the control key, among others.
		*
		*
		*
		*Web Driver :
		*
		*WebDriver is an interface provided by Selenium WebDriver. 
		*It is used to automate the testing of a web application. 
		*So, this tool is used to automate web application testing to verify that it works as expected. 
		*It supports many browsers such as Firefox, Chrome, IE, and Safari.
		*
		*
		*
		*iFrame :
		*iFrame in Selenium Webdriver is a web page or an inline frame which is embedded in another web page or an HTML document embedded inside another HTML document. 
		*The iframe is often used to add content from other sources like an advertisement into a web page. 
		*
		*driver.switchto.frame("abc");
		*
		*
		*
		*
		*
		*=================================================================================================================================
		*
		*
		*Test execution report :
		*
		*The Test Execution report helps the testing team, the project manager, and the product owner to understand the status of the testing and the overall stability of the application. 
		*The report enables the user to get a detailed understanding of the status of the Test Case within a single or multiple Test Cycle. The report allows the user to view the executions graphically or in tabular format.
		*Test Execution Reports can be shared and discussed during retrospective as it contains detailed test execution status. The report can help the organization visualize their current quality and plan ahead QA and Development activities timely.
		*For the selected Project, the Test Execution Report shows how many tests were run over a period of Time, Sprint, or Version. The report displays the overall progress of test executions.
		*
		*
		*Bug Triage :
		*Bug triage is a process to-
		*Ensure bug report completeness
		*Assign and analyze the bug
		*Assigning bug to proper bug owner
		*Adjust bug severity properly
		*Set appropriate bug priority
		*
		*
		*Status Codes :
		*
		*100 - Informational response
		*200 - Successful response
		*300 - Redirection message
		*400 - Client side error
		*500 - Server side error
		*
		*Scenario based Test cases :
		*
		*Test Scenario gives the idea of what we have to test. Test Scenario is like a high-level test case.
		*Test Scenario answers “What to be tested”.
		*Test cases are the set of positive and negative executable steps of a test scenario 
		*A test case has a set of pre-conditions, test data, expected result, post-conditions and actual results.
		*
		*
		*
		*
		*
		*/
		

	}

}
