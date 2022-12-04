package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	//Thread.sleep(5000);
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Srikanth");
	alert.accept();
	String text = driver.findElement(By.xpath("//p[text()='Hello Srikanth! How are you today?']")).getText();
	System.out.println(text);
	
	if(text.contains("Srikanth")) {
		
		System.out.println("Name is verified");
	}
	
	else {
		
		System.out.println("Name is not verified");
	}
	

	}
}
