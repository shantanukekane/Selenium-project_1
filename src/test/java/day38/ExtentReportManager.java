package day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent;  // populate common info on the report
	public ExtentTest test;    // creating the test case entries in the report and update status in the test method
	
	
	public void onStart(ITestContext context) {
	
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\myReport.html"); //Specify the location of Report
		
		sparkReporter.config().setDocumentTitle("Automation Report");  // Title Report	
		sparkReporter.config().setReportName("Functional Testing");   // Name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "Localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pavan");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome,Firefox,Edge");;
		
	}
	
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());   // create a new entry in the Report
		test.log(Status.PASS, "Test case PASSED is:" +result.getName());  // update status p/f/s

	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());  // create a new entry in the Report
		test.log(Status.FAIL, "Test case FAILED is:"+result.getName());  // update the status in the report
		test.log(Status.FAIL, "Test case FAILED cause is: "+result.getThrowable());  // it display the Error message
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
	    test = extent.createTest(result.getName());
	    test.log(Status.SKIP, "Test case SKIP is:" +result.getName());
		
	}
	
	
	public void onFinish(ITestContext Context) {
		
	    extent.flush();
		
	}
	
	
}
