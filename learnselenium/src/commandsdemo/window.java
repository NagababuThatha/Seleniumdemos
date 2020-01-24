package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/popup.php");
		driver.manage().window().maximize();
		String babu=driver.getWindowHandle();
		System.out.println(babu);
		driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		Set<String>s=driver.getWindowHandles();
		Iterator<String>i=s.iterator();
		while(i.hasNext())
		{
			String b=i.next();
			if(!babu.equalsIgnoreCase(b))
			{
				driver.switchTo().window(b);
				driver.findElement(By.xpath("//span[contains(text(),'Big Data')]"));
				driver.findElement(By.xpath("//span[contains(@class,'g-separator g-menu-item-content')]//span[contains(@class,'g-menu-item-title')][contains(text(),'Live Projects')]"));
				System.out.println(b);
				driver.close();
				
				
			}
			driver.switchTo().window(babu);
		}
		
		
	}
}

	