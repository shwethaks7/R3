package r3.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class R3TestFlowListener implements ITestListener{

	ExtentReports extRep = ExtentReporting.reporting() ;
	ExtentTest ext1 ;
	ThreadLocal<ExtentTest> t1 = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub		
		//hello
		ext1 = extRep.createTest(result.getMethod().getMethodName());
		t1.set(ext1);
				
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		t1.get().log(Status.PASS,result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		t1.get().fail(result.getThrowable());
				
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extRep.flush();
		
		
	}

}
