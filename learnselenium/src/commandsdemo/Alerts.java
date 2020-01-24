package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		String alerttitle=driver.switchTo().alert().getText();
		System.out.println("Alert title is:"+alerttitle);
		 alert1.accept();
		 driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
		 Alert alert2=driver.switchTo().alert();
			String alerttitle2=driver.switchTo().alert().getText();
			System.out.println("Alert title is:"+alerttitle2);
			Thread.sleep(3000);
			alert2.dismiss();
			
			driver.findElement(By.xpath("////a[contains(text(),'Alert with Textbox')]")).click();
			 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
			 Alert alert3=driver.switchTo().alert();
				String alerttitle3=driver.switchTo().alert().getText();
				System.out.println("Alert title is:"+alerttitle3);
				Thread.sleep(3000);
				alert3.sendKeys("nag");
				alert3.accept();
				
		
	}
} 