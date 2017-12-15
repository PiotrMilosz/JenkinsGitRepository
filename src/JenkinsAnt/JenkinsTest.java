package JenkinsAnt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	
	public void TestAnt(){
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http:/google.pl");
	}

}
