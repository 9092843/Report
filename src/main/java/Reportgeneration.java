import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Base64;

import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reportgeneration {
	private static ExtentReports extent;
    private static ExtentTest test;
    private static WebDriver driver;

    
	public static ExtentTest initializereport(String storyName , String testCaseName) {
		// TODO Auto-generated method stub
		LocalDateTime currentDateTime = LocalDateTime.now();
		String ExtentHtmlReporter = "report"+currentDateTime.toString().replaceAll(":", "");
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\vijayans\\Pictures\\report\\"+ExtentHtmlReporter+".html");
		
		extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return test = extent.createTest(storyName,testCaseName);
        
	}

	public static void generatingreport() {
		extent.flush();
	}
	
	
	public static void generatingscreenshot(WebDriver driver, ExtentTest log) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		String screenshotName = "screenshot"+currentDateTime.toString().replaceAll(":", "");
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        // Save the screenshot to a specific location
	        String screenshotPath = Paths.get("C:/Users/vijayans/Pictures/report",screenshotName+".png").toString();
	        screenshotFile.renameTo(new File(screenshotPath));
	        // Log the screenshot in the report
	        log.addScreenCaptureFromPath(screenshotPath,"screenshotName ");    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
