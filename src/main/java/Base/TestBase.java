package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public	static	WebDriver	driver;
	public	void	initalization()
	{
	WebDriverManager.chromedriver().setup();
	driver	=	new	ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	}

}
