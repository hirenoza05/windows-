package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CheckboxExp {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome,driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.jqueryfaqs.com/demos/112/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > button")).click();
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > ul > li:nth-child(2) > a > label > input[type=checkbox]")).click();
		driver.findElement(By.cssSelector("#main > div > div:nth-child(3) > div > div > div.col-xs-12.col-md-9.left-section > span > div > ul > li:nth-child(4) > a > label > input[type=checkbox]")).click();
		
	}

}
