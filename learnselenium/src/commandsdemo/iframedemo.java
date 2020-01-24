package commandsdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args)throws Exception {
		 WebDriver driver;
		List<WebElement>iframescount=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames:"+iframescount.size());
		for(int i=0;i<iframescount.size();i++)
		{
			System.out.println(iframescount.get(i).getAttribute("name"));

		}
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
         textbox.sendKeys("selenium");
         driver.switchTo().defaultContent();
 		WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
 		secondtab.click();
 		driver.switchTo().frame(1);
 		driver.switchTo().frame(0);
 		WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
 		textbox2.sendKeys("webdriver");
 		Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
        //driver.close();




         
	}

}
