package extent;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	static String reportPath ="";
	public static ExtentReports getInstance(){
		if(extent == null){
			extent = new ExtentReports(reportPath,true);
		}
		return extent;
	}

}
