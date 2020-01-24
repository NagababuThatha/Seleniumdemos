package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class registertest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("First name")).sendKeys("qwe");
		driver.findElement(By.id("Last name")).sendKeys("rty");
		driver.findElement(By.id("Email")).sendKeys("qwerty@gmail.com");


		
	}
}
