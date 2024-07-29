package temp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingTest {

	public void hellojava()
	{
		WebDriver driver=null;
		ChromeOptions options= new ChromeOptions();
		
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
