package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HendlingFrame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://www.selenium.dev/");
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.cssSelector(".topNav > ul:nth-child(4) > li:nth-child(4)")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.cssSelector("html body div.indexContainer ul li a span.interfaceName")).click();
		
		driver.close();
			
	}

}
