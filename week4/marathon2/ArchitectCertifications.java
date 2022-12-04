package week4.marathon2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
        List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow dom=new Shadow(driver);
		Thread.sleep(5000);
		dom.findElementByXPath(("//span[text()='Learning']")).click();
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		WebElement ele = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(ele).perform();
		WebElement findElementByXPath = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.scrollToElement(findElementByXPath).click(findElementByXPath).perform();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		Thread.sleep(5000);
		String titleOfTheUrl = driver.getCurrentUrl();
		System.out.println("url of the current page is "+titleOfTheUrl);
		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]")).getText();
		System.out.println(" Text(Summary) of Salesforce Architect "+summary);
		List<WebElement> listOfSalesForceArchitects = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Salesforce Architect Certifications are ");
		for(int i=0;i<listOfSalesForceArchitects.size();i++) {
			
			String architectText = listOfSalesForceArchitects.get(i).getText();
			System.out.println(architectText);
		}
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> listOfCertifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Certifications available under Application Architect are ");
		for(int i=0;i<listOfCertifications.size();i++) {
			
			String certificationList = listOfCertifications.get(i).getText();
			System.out.println(certificationList);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
