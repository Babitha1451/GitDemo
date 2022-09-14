package Project1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Azuga\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//maximize window
		driver.manage().window().maximize();
		
		//open browser with desired URL
		driver.get("Http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("temp_username")).sendKeys("supportadmin");
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("loginBtn")).click();
		
		
		driver.findElement(By.xpath("//input[@name='searchStr']")).sendKeys("babithahs+002@gmail.com");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.id("a-logistics")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text=driver.findElement(By.xpath("//*[@id='logistics-table_wrapper']/table/tbody/tr[4]/td[4]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id='submenu-fulfillment']/a")).click();
		WebElement a=driver.findElement(By.id("pending-searchStr"));
		a.sendKeys(text);
		a.sendKeys(Keys.ENTER);
		driver.findElement(By.className("fulfill-btn")).click();
		driver.findElement(By.id("fullfillment-tracking-num")).sendKeys("1239875678");
		driver.findElement(By.id("deviceserialnumber1")).sendKeys("1239875678");
		driver.findElement(By.xpath("//*[@id=\"ff-add-to-account\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ff-confirm\"]")).click();
		
		
	}
}
