package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ivy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("srikanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("telkapalli");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sri");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test123");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sri.123@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(state);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String Title=driver.getTitle();
		System.out.println("Title of the resulting page is "+Title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ram");
		driver.findElement(By.className("smallSubmit")).click();
		String Title1=driver.getTitle();
		System.out.println("Title of the resulting page is "+Title1);
		
		
		
		
		
		

	}

}
