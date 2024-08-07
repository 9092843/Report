import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentTest;



public class ReportCreation {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		testCase1();
//		testCase2();
//		testCase3();
//		testCase4();
//		testCase5();
		summaryreport();

	}
	

	private static void summaryreport() {
		String filePath = "C:\\Users\\vijayans\\Pictures\\summary\\file.html";
		        // Create a StringBuffer to store the HTML content
		        StringBuffer htmlBuffer = new StringBuffer();

		        // Append HTML content to the StringBuffer
		        htmlBuffer.append("<!DOCTYPE html>\n");
		        htmlBuffer.append("<html lang=\"en\">\n");
		        htmlBuffer.append("<head>\n");
		        htmlBuffer.append("    <meta charset=\"UTF-8\">\n");
		        htmlBuffer.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
		        htmlBuffer.append("    <title>Automation Testing Summary Report</title>\n");
		        
		        htmlBuffer.append("<style>\n");
		        htmlBuffer.append("    body {\n");
		        htmlBuffer.append("        font-family: Arial, sans-serif;\n");
		        htmlBuffer.append("        background-color: #f4f4f4;\n");
		        htmlBuffer.append("        color: #333;\n");
		        htmlBuffer.append("        margin: 20px;\n");
		        htmlBuffer.append("        display: flex;\n");
		        htmlBuffer.append("        justify-content: space-between;\n");
		        htmlBuffer.append("        align-items: flex-start;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    h1 {\n");
		        htmlBuffer.append("        color: #007bff;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    h2 {\n");
		        htmlBuffer.append("        color: #333;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    table {\n");
		        htmlBuffer.append("        width: 100%;\n");
		        htmlBuffer.append("        border-collapse: collapse;\n");
		        htmlBuffer.append("        margin-top: 20px;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    th, td {\n");
		        htmlBuffer.append("        border: 1px solid #ddd;\n");
		        htmlBuffer.append("        padding: 12px;\n");
		        htmlBuffer.append("        text-align: left;\n");
		        htmlBuffer.append("        padding-left: 30px;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    th {\n");
		        htmlBuffer.append("        background-color: #007bff;\n");
		        htmlBuffer.append("        color: #fff;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .pass {\n");
		        htmlBuffer.append("        color: #28a745;\n");
		        htmlBuffer.append("        font-weight: bold;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .fail {\n");
		        htmlBuffer.append("        color: #dc3545;\n");
		        htmlBuffer.append("        font-weight: bold;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .error {\n");
		        htmlBuffer.append("        color: #ffc107;\n");
		        htmlBuffer.append("        font-weight: bold;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .chart-container {\n");
		        htmlBuffer.append("        width: 40%;\n");
		        htmlBuffer.append("        margin-top: 12%;\n");
		        htmlBuffer.append("        position: relative;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .chart-circle {\n");
		        htmlBuffer.append("        width: 10px;\n");
		        htmlBuffer.append("        height: 10px;\n");
		        htmlBuffer.append("        border-radius: 50%;\n");
		        htmlBuffer.append("        position: absolute;\n");
		        htmlBuffer.append("        transform-origin: center;\n");
		        htmlBuffer.append("        transform: rotate(-90deg);\n");
		        htmlBuffer.append("        transition: transform 1s;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .chart-circle.pass {\n");
		        htmlBuffer.append("        background-color: #28a745;\n");
		        htmlBuffer.append("        clip-path: polygon(50% 50%, 100% 50%, 50% 0%);\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .chart-circle.fail {\n");
		        htmlBuffer.append("        background-color: #dc3545;\n");
		        htmlBuffer.append("        clip-path: polygon(50% 50%, 100% 50%, 50% 0%);\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .chart-circle.error {\n");
		        htmlBuffer.append("        background-color: #ffc107;\n");
		        htmlBuffer.append("        clip-path: polygon(50% 50%, 100% 50%, 50% 0%);\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("    .pie-chart {\n");
		        htmlBuffer.append("        width: 50%;\n");
		        htmlBuffer.append("        height: 50%;\n");
		        htmlBuffer.append("        position: absolute;\n");
		        htmlBuffer.append("        top: 0;\n");
		        htmlBuffer.append("        right: 0;\n");
		        htmlBuffer.append("    }\n");

		        htmlBuffer.append("</style>");
		        
		        // Append the entire style block
		        htmlBuffer.append(getStyleContent());
		        htmlBuffer.append("    </style>\n");
		        htmlBuffer.append("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
		        htmlBuffer.append("</head>\n");
		        htmlBuffer.append("<body>\n");
		        htmlBuffer.append("    <div>\n");
		        htmlBuffer.append("        <h1>Automation Testing Summary Report</h1>\n");
		        htmlBuffer.append("        <h2>Test Results Summary:</h2>\n");
		        htmlBuffer.append("        <p>\n");
		        htmlBuffer.append("            <span class=\"pass\">Pass: 7 (70%)</span>,\n");
		        htmlBuffer.append("            <span class=\"fail\">Fail: 2 (20%)</span>,\n");
		        htmlBuffer.append("            <span class=\"error\">Error: 1 (10%)</span>\n");
		        htmlBuffer.append("        </p>\n");
		        htmlBuffer.append("        <table>\n");
		        htmlBuffer.append("            <tr>\n");
		        htmlBuffer.append("                <th>S.No</th>\n");
		        htmlBuffer.append("                <th>Test Case</th>\n");
		        htmlBuffer.append("                <th>Status</th>\n");
		        htmlBuffer.append("                <th>Start Time</th>\n");
		        htmlBuffer.append("                <th>End Time</th>\n");
		        htmlBuffer.append("                <th>Execution Time (seconds)</th>\n");
		        htmlBuffer.append("            </tr>\n");
		        
		        // Append rows for test cases (you can add more rows as needed)
		        htmlBuffer.append(getTestCaseRow(1, "Test Case 1", "Passed", "2024-01-19 10:00:00", "2024-01-19 10:05:00", "5"));
		        htmlBuffer.append(getTestCaseRow(2, "Test Case 2", "Failed", "2024-01-19 10:05:00", "2024-01-19 10:13:00", "8"));
		        htmlBuffer.append("        </table>\n");
		        htmlBuffer.append("    </div>\n");
		        htmlBuffer.append("    <div class=\"chart-container\">\n");
		        htmlBuffer.append("        <canvas id=\"pieChart\" width=\"235\" height=\"235\"></canvas>\n");
		        htmlBuffer.append("    </div>\n");
		        htmlBuffer.append("    <script>\n");
		        // Append the JavaScript content for the pie chart
		        htmlBuffer.append(getJavaScriptContent());
		        htmlBuffer.append("    </script>\n");
		        htmlBuffer.append("</body>\n");
		        htmlBuffer.append("</html>");

		        // Print or use the StringBuffer as needed
		        System.out.println(htmlBuffer.toString());
		        
		        
		        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
		            writer.println(htmlBuffer.toString());
		            System.out.println("HTML file created successfully at: " + filePath);
		        } catch (IOException e) {
		            System.err.println("Error creating HTML file: " + e.getMessage());
		        }
		    }

		    // Helper method to get the style content
		    private static String getStyleContent() {
		        // Add your style content here
		        return "";
		    }

		    // Helper method to get a row for a test case
		    private static String getTestCaseRow(int serialNumber, String testCase, String status, String startTime, String endTime, String executionTime) {
		        return "            <tr>\n" +
		                "                <td>" + serialNumber + "</td>\n" +
		                "                <td>" + testCase + "</td>\n" +
		                "                <td class=\"" + status.toLowerCase() + "\">" + status + "</td>\n" +
		                "                <td>" + startTime + "</td>\n" +
		                "                <td>" + endTime + "</td>\n" +
		                "                <td>" + executionTime + "</td>\n" +
		                "            </tr>\n";
		    }

		    // Helper method to get the JavaScript content
		    private static String getJavaScriptContent() {
		        // Add your JavaScript content here, including the pie chart
		        return "        // JavaScript to generate the pie chart using Chart.js\n" +
		                "        document.addEventListener('DOMContentLoaded', function () {\n" +
		                "            var ctx = document.getElementById('pieChart').getContext('2d');\n" +
		                "            var myChart = new Chart(ctx, {\n" +
		                "                type: 'doughnut',\n" +
		                "                data: {\n" +
		                "                    labels: ['Pass', 'Fail', 'Error'],\n" +
		                "                    datasets: [{\n" +
		                "                        data: [70, 20, 10],\n" +
		                "                        backgroundColor: ['#28a745', '#dc3545', '#ffc107'],\n" +
		                "                    }],\n" +
		                "                },\n" +
		                "                options: {\n" +
		                "                    responsive: true, // Set to false to prevent Chart.js from adjusting the size\n" +
		                "                    maintainAspectRatio: false, // Set to false to allow the canvas to dynamically resize\n" +
		                "                }\n" +
		                "            });\n" +
		                "        });";
		       
		    }
	

	private static void testCase5() {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			ExtentTest log =Reportgeneration.initializereport("title", "testname");
			log.info("Step1-logining into myntra");
			log.info("https://www.myntra.com/");
			String url ="https://www.myntra.com/";
			Reportgeneration.generatingscreenshot(driver,log);
			driver.get(url);
			driver.manage().window().maximize();
	        log.info("Test started...");
			System.out.println("Step2-finding a product to buy");
			log.info("Step2-finding a product to buy");
			testMethod(driver);
			Reportgeneration.generatingscreenshot(driver,log);
			System.out.println("Step3-Sarees");
			log.info("Test completed...");
			System.out.println("report");
			Reportgeneration.generatingreport();
	}

	private static void testCase4() {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			ExtentTest log =Reportgeneration.initializereport("title", "testname");
			log.info("Step1-logining into myntra");
			log.info("https://www.myntra.com/");
			String url ="https://www.myntra.com/";
			Reportgeneration.generatingscreenshot(driver,log);
			driver.get(url);
			driver.manage().window().maximize();
	        log.info("Test started...");
			System.out.println("Step2-finding a product to buy");
			log.info("Step2-finding a product to buy");
			testMethod(driver);
			Reportgeneration.generatingscreenshot(driver,log);
			System.out.println("Step3-Sarees");
			log.info("Test completed...");
			System.out.println("report");
			Reportgeneration.generatingreport();
	}

	private static void testCase3() {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			ExtentTest log =Reportgeneration.initializereport("title", "testname");
			log.info("Step1-logining into myntra");
			log.info("https://www.myntra.com/");
			String url ="https://www.myntra.com/";
			Reportgeneration.generatingscreenshot(driver,log);
			driver.get(url);
			driver.manage().window().maximize();
	        log.info("Test started...");
			System.out.println("Step2-finding a product to buy");
			log.info("Step2-finding a product to buy");
			testMethod(driver);
			Reportgeneration.generatingscreenshot(driver,log);
			System.out.println("Step3-Sarees");
			log.info("Test completed...");
			System.out.println("report");
			Reportgeneration.generatingreport();
	}

	private static void testCase2() {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			ExtentTest log =Reportgeneration.initializereport("title", "testname");
			log.info("Step1-logining into myntra");
			log.info("https://www.myntra.com/");
			String url ="https://www.myntra.com/";
			Reportgeneration.generatingscreenshot(driver,log);
			driver.get(url);
			driver.manage().window().maximize();
	        log.info("Test started...");
			System.out.println("Step2-finding a product to buy");
			log.info("Step2-finding a product to buy");
			testMethod(driver);
			Reportgeneration.generatingscreenshot(driver,log);
			System.out.println("Step3-Sarees");
			log.info("Test completed...");
			System.out.println("report");
			Reportgeneration.generatingreport();
	}

	private static void testCase1() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		ExtentTest log =Reportgeneration.initializereport("title", "testname");
		log.info("Step1-logining into myntra");
		log.info("https://www.myntra.com/");
		String url ="https://www.myntra.com/";
		Reportgeneration.generatingscreenshot(driver,log);
		driver.get(url);
		driver.manage().window().maximize();
        log.info("Test started...");
		System.out.println("Step2-finding a product to buy");
		log.info("Step2-finding a product to buy");
		testMethod(driver);
		Reportgeneration.generatingscreenshot(driver,log);
		System.out.println("Step3-Sarees");
		log.info("Test completed...");
		System.out.println("report");
		Reportgeneration.generatingreport();
		
	}

	private static void testMethod(WebDriver driver) {
		try {
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Search for products')])")).sendKeys("shoes" + Keys.ENTER);
			driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
			
			
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		
	}

}
