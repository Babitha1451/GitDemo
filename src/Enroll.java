import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Enroll {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Azuga\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ruc-i95.azuga.com/");
		driver.findElement(By.id("temp_username")).sendKeys("supportadmin");
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("loginBtn")).click();
		}

}
