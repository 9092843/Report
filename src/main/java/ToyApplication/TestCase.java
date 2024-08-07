package ToyApplication;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentTest;

public class TestCase extends commonfunctions{
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vijayans\\Desktop\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.smythstoys.com");
	Thread.sleep(100);
	
	WebElement loginsignup = driver.findElement(By.xpath(xpaths.loginsignupbtn));
	loginsignup.click();
	WebElement user = driver.findElement(By.xpath(xpaths.username));
	user.sendKeys("vijayanmass1006@gmail.com");
	WebElement pass = driver.findElement(By.xpath(xpaths.password));
	pass.sendKeys("Pavitha@30");
	WebElement loginsub = driver.findElement(By.xpath(xpaths.loginsubmitbtn));
	loginsub.click();
    
}
}