package week4.marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disble-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev111765.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("!q2UA%Zbpi1B");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(10000);
		Shadow dom=new Shadow(driver);
		Thread.sleep(10000);
		//dom.findElementByXPath(("//div[@id='all']")).click();
		dom.findElementByXPath(("//div[text()='All']")).click();
		Thread.sleep(5000);
		Actions builder=new Actions(driver);
		WebElement findElementByXPath = dom.findElementByXPath("//span[text()='Service Catalog']");
		builder.scrollToElement(findElementByXPath).click(findElementByXPath).perform();
		Thread.sleep(10000);
		//Shadow dom1 = new Shadow(driver);
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select monthlyData=new Select(ele);
		monthlyData.selectByVisibleText("Unlimited [add $4.00]");
		driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
		String verifyOrder = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println(verifyOrder);
		String requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request number is " +requestNumber);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
