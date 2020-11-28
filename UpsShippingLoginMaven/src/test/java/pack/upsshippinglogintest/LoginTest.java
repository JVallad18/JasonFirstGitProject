package pack.upsshippinglogintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
	WebElement userid = driver.findElement(By.id("email"));
	userid.sendKeys("bsdbjdnkndk@gmail.com");
			
	WebElement password = driver.findElement(By.xpath("//*[@id=\'pwd\']"));
	password.sendKeys("hewbhcbkebjksebck");
	
	WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\'submitBtn\']"));
	loginbutton.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
