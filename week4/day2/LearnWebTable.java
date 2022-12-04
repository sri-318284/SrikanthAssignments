package week4.day2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]/a"));
				
		Thread.sleep(5000);
		Set<String> UniqueTrainNames =new LinkedHashSet<String>();
		for(int i=2;i<=rows.size();i++) {
			
			String trainName = driver.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr[" +i + "]/td[2]/a")).getText();
			System.out.println(trainName);
			UniqueTrainNames.add(trainName);
			
		}
		
		if(rows.size()==UniqueTrainNames.size()) {
			
			System.out.println("Duplicate trains found");
		}
		
		else {
			
			System.out.println("Duplicate trains not found");
		}
		

	}

}
