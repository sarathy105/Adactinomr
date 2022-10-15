package com.reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * @Description Used to report the OMR Branch AdactinHotel Automation
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */
public class Reporting extends BaseClass {
	
	/**
	 * @Description Generate JVM report
	 * @param JsonFile
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @Date 19-09-2022
	 */

	public static void generateJVMReport(String JsonFile) throws FileNotFoundException, IOException {
		File file =new File(System.getProperty("user.dir")+ getPropertyFileValue("jvmReportPath"));
		Configuration con=new Configuration(file, "Adactin Hotel");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "105");
		con.addClassifications("OS", "Windows 10");
		con.addClassifications("Sprint", "15");

		List<String>jsonfile = new ArrayList<String>();
		jsonfile.add(JsonFile);
		ReportBuilder report = new ReportBuilder(jsonfile, con);
		report.generateReports();
	}

}
