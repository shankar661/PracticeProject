package newwww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Newww1 
{
	@Test
	public void mainn()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
