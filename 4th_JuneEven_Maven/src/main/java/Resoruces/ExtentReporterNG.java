package Resoruces;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.utility.RandomString;

public class ExtentReporterNG {

	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String random = RandomString.make(4);
		String name="OrangeHRM";
		String path = System.getProperty("user.dir")+"\\Reports\\"+name+random+".html";
		
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("4 June Framework Results");
		report.config().setDocumentTitle("Automation Execution Results");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("QA Automation Engineer", "Akshay Mohod");
		
		return extent;
			
	}	
}
