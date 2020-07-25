package Sites.PageObjecModelFarmeWork;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Base {
	
public WebDriver driver;
@Parameters({"browser","url"})
  @BeforeClass
  
  public void browser(String browser,String url) throws InterruptedException{
		 if(browser.equalsIgnoreCase("Chrome")) { 
			 
			String userdirectoriespth=System.getProperty("user.dir");
			System.out.println(userdirectoriespth);
			 System.setProperty("webdriver.chrome.driver", "/Users/rafi/Downloads/chromedriver");
		 driver=new ChromeDriver();
		 driver.navigate().to(url);
		 Thread.sleep(6000);
		 driver.manage().window().maximize();
		 } else if (browser.equalsIgnoreCase("Firefox")) {
			 
			 String userdirectoriespth=System.getProperty("user.dir");
			 System.setProperty("webdriver.gecko.driver","/Users/rafi/Downloads/geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.navigate().to(url);
			 Thread.sleep(6000);
			 driver.manage().window().maximize();
		 }else {System.out.println("Wrong browser name");
			 
		 }}
  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	screenshotspage();
	Thread.sleep(8000);
	driver.quit();
	  
  }
  
  public void screenshotspage() throws IOException {
	   String userdirectoriespth=System.getProperty("user.dir");
	   Date dt=new Date();
	   String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
	   File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(Captureofshots, new File(userdirectoriespth+"/Screenshot/"+ut));
			   

}}
