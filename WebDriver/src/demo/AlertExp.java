package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
		driver.quit();
		

	}

}
