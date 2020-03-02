package gluklich;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TC_01 {
	
	/*static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}*/
	
	@Test
	
	 public void testOne()
	 {
		WebDriverManager.chromedriver().version("76").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	 }

}
