package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		driver.manage().window().maximize();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
        List<String> windows = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
        driver.switchTo().window(windows.get(0));
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        //Thread.sleep(5000);
        Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
        List<String> windows1 = new ArrayList<String>(windowHandles1);
        driver.switchTo().window(windows1.get(1));
        driver.manage().window().maximize();
       
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
        driver.switchTo().window(windows.get(0));
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        driver.switchTo().alert().accept();
        String title = driver.getTitle();
        System.out.println("Title of the page is "+title);
        
		
	}

}
