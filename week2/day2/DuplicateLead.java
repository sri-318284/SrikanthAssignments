package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sri.123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String firstResultingLeadName = driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(firstResultingLeadName);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String titleOfThePage = driver.getTitle();
		if(titleOfThePage.equals("Duplicate Lead | opentaps CRM")) {
			
			System.out.println("Title of the page is Duplicate Lead ");
		}
		
		else {
			
			System.out.println("Title of the page is not Duplicate Lead ");
		}
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		

	}

}
