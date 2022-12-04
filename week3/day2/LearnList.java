package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> priceList=new ArrayList<Integer>() ;
		for (WebElement eachPrice : allPrices) {
			
			System.out.println(eachPrice.getText());
			
			String text=eachPrice.getText().replace(",", "").replace("₹","");
			int price=Integer.parseInt(text);
			priceList.add(price);
		}
		
		
		
		Collections.sort(priceList);
		System.out.println("Least price is "+priceList.get(0));
	}

}
