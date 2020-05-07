package BasicLogin;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogingFirefox {

	public static void main(String[] args)  {
		String st=System.getProperty("user.dir")+"\\src\\browser\\geckodriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.gecko.driver", st);
		WebDriver s=new FirefoxDriver();
		s.get("https://www.google.com");
		Thread.sleep(3000);
		
		//Navigate one page to other page
		
		//s.navigate().to("https://www.facebook.com");
		
		//Back
		//s.navigate().back();
		//Forward
		//s.navigate().forward();
		// take screenshot
		File src = ((TakesScreenshot) s).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src, new File
		("C:\\Users\\Dev\\eclipse-workspace\\SeleniumTesting\\src\\BasicLogin\\Screen.png"));


	}

}
