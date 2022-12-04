package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
        List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
	    System.out.println(driver.getTitle());
	    driver.close();
	    driver.switchTo().window(windows.get(0));
	    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	    Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
        List<String> windows1 = new ArrayList<String>(windowHandles1);
        driver.switchTo().window(windows1.get(1));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows1.get(2));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows.get(0));
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
        List<String> windows2 = new ArrayList<String>(windowHandles2);
        driver.switchTo().window(windows2.get(1));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows2.get(2));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows2.get(3));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows.get(0));
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Thread.sleep(5000);
        Set<String> windowHandles3 = driver.getWindowHandles();
		System.out.println(windowHandles3);
        List<String> windows3 = new ArrayList<String>(windowHandles3);
        driver.switchTo().window(windows3.get(1));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows3.get(2));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windows.get(0));
        
	    
	    

	}

}
