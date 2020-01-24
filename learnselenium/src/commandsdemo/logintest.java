package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class logintest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//System.setProperty("webdriver.gecko.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        //WebDriver driver=new FirefoxDriver();
        // driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("nag123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nag123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname="Demo Web Shop";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		
		System.out.println(actualname.length());
		if(expectedname.equals(actualname)){
			System.out.println("u are on right page");
		}
		else{
			System.out.println("incorrect page");
		}
			
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String ps=driver.getPageSource();
			System.out.println(ps);
			System.out.println(ps.length());
			driver.close();
	}
}
