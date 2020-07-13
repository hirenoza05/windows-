package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromr.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement mousehover =driver.findElement(By.id("nav-link-accountList"));
		
		Actions hover= new Actions(driver);
		
		hover.moveToElement(mousehover);
		
		driver.findElement(By.linkText("Your orders")).click();
		
	}
}
