package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String priceOfFirstProduct = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the first product is " +priceOfFirstProduct);
		String noOfcustomerRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Number of Customer Ratings is " +noOfcustomerRating); 
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/amazon.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		String cartSubtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cart subtotal is "+cartSubtotal);
		if(cartSubtotal.contains(priceOfFirstProduct)) {
			
			System.out.println("Price is verified");
		}
		else {
			
			System.out.println("Price is not verified");
		}
		
		
		driver.quit();
		
		
		
		
		

	}

}
