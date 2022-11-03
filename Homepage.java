package fullTestLeafground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Homepage {
	@Test
	public void inttateBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		//driver.close();
		
		
		
		
	}
	
	

}
