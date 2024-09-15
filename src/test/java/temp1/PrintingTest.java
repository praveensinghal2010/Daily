package temp1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingTest {

	public void hellojava() 
	{
		WebDriver driver =null;
		try {
			
		
		 driver=null;
		ChromeOptions options= new ChromeOptions();
			//EdgeOptions options = new EdgeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		//options.addArguments("headless");
		
		URL abc= new URL("http://3.110.33.155:4444/wd/hub");
		
		driver= new RemoteWebDriver(abc,options);
		
		System.out.print("my code is  running");	
		
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.bseindia.com/");
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(5000);
			driver.get("https://www.bseindia.com/");
			Thread.sleep(15000);
			driver.get("https://www.bseindia.com/");
			driver.get("https://www.bseindia.com/");
		driver.quit();
		}
		catch(MalformedURLException e)
		{
			System.err.print("hello java");
		}
		catch(Exception e)
		{
			System.err.print("bello");
		}finally {
			if(driver !=null)
			{
				driver.quit();
			}
		}
		
	}
	
}
