package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class automationdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("nagababu");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("thatha");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("jkxbjkxjhqv,hxhuixg,phwsio");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("nag123@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]  ")).sendKeys("9848022338");
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='Male']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Hockey']")).click();
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1=new Select(driver.findElement(By.id("yearbox")));
		sel1.selectByVisibleText("1996");
		List<WebElement>linklist=sel1.getOptions();
		System.out.println("no of years:"+linklist.size());
		for(int i=0;i<linklist.size();i++){
			System.out.println("Link names are:"+linklist.get(i).getText());
		}
		WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2=new Select(Month);
		sel2.selectByVisibleText("November");
		WebElement Day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel3=new Select(Day);
		sel3.selectByVisibleText("1");
		//WebElement Languages=driver.findElement(By.xpath("//div[@id='msdd']"));
		//Select sel4=new Select(Languages);
		//sel4.selectByVisibleText("English");
		//WebElement SelectSkills=driver.findElement(By.xpath("//select[@id='Skills']"));
		//Select sel5=new Select(SelectSkills);
		//sel5.selectByVisibleText("Java");
	}
	
}