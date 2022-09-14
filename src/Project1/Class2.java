package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.Iterator;


public class Class2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Azuga\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement text1=driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		text1.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText());
		
		String option=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		
		//driver.findElement(By.id("dropdown-class-example")).sendKeys(text)
		//Select s=new Select((WebElement) driver);
		Thread.sleep(3000);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(option);
		
		
		
		
	}

}
