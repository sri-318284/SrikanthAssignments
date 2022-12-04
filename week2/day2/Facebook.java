package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Srikanth");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("telkapalli");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='reg_email__']")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("1233445880");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Test@123");
		WebElement date=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select dddate=new Select(date);
		dddate.selectByVisibleText("22");
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select dmonth=new Select(month);
		dmonth.selectByVisibleText("Jan");
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select dyear=new Select(year);
		dyear.selectByVisibleText("1986");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
