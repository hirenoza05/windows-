package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownboxExp {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	 WebElement countrydd = driver.findElement(By.name("country"));
	
	 Select dd = new Select(countrydd);
	// dd.selectByVisibleText("INDIA");
	 dd.selectByValue("54");
	 
	 driver.close();
	 	}

}
