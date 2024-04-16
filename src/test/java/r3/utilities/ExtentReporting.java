package r3.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting {
	
static public ExtentReports reporting() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";		
		ExtentSparkReporter extent = new ExtentSparkReporter(path);
		extent.config().setDocumentTitle("USD Rate API extent report result");
		extent.config().setReportName("Rate test result");
		ExtentReports extentRep = new ExtentReports();
		extentRep.attachReporter(extent);
		extentRep.setSystemInfo("tester", "shwetha");
//extent report			
		return extentRep;		

	}
}
