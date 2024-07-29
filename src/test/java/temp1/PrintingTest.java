package temp1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingTest {

	public void hellojava() throws MalformedURLException
	{
		WebDriver driver=null;
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("headless");
		
		URL abc= new URL("http://localhost:4444/wd/hub");
		
		driver= new RemoteWebDriver(abc,options);
		
//		System.out.print("my code is  running");	
//		
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.close();
	}
	
}
