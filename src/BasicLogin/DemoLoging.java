package BasicLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoging {

	public static void main(String[] args) {
	 String st=	System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", st);
	 WebDriver s= new ChromeDriver();

	 s.get("https://www.facebook.com");
	}

}

