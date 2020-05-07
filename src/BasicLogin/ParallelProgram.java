package BasicLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class ParallelProgram {

		public WebDriver driver;
		@Parameters("b")
		@Test
		public void browserLaunch(String browser_name) {
			if(browser_name.equalsIgnoreCase("chrome")) {
				 String st=	System.getProperty("user.dir")
						 +"\\src\\Browser\\chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver", st);
				 driver= new ChromeDriver();
			}
			else if(browser_name.equalsIgnoreCase("firefox") ) {
				String st=System.getProperty("user.dir")+
						"\\src\\Browser\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", st);
				driver=new FirefoxDriver();
			}
		
				driver.get("https://www.facebook.com");
			}
		}
		

		
	
