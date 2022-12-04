package week4.marathon2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https:redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-no='2']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-no='2']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	//	driver.findElement(By.xpath("//input[@id='onward_cal']")
		//driver.findElement(By.xpath("//td[@class='wd day']")).click();	
		driver.findElement(By.xpath("//td[text()='2']")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		String noOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of buses found are "+noOfBuses);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		String nameOfSecondResultingBus = driver.findElement(By.xpath("(//div[@class='column-two p-right-10 w-30 fl'])[2]")).getText();
		System.out.println("Name of second resulting bus is" +nameOfSecondResultingBus);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		Thread.sleep(5000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/redbus.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
	}

}
