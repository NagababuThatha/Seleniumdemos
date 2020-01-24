package commandsdemo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-word");
		
		Robot robot=new Robot();
		driver.findElement(By.xpath("//div[@class='l0v3m7-6 hIetmX']")).click();
		
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\ISTQB\\tryqa.com-ISTQB-Dumps-and-Mock-Tests-for-Foundation-Level-Paper-1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

		
		

	}

}
