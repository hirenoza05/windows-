package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiedInvalidLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.findElement(By.id("email")).sendKeys("hirenj7877@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("pass@123456");
		
		driver.findElement(By.id("loginbutton")).click();
		
		String actualText= driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
		
		String expectedText= "The email you’ve entered doesn’t match any account. Sign up for an account.";
		
		if (actualText.equals(expectedText))
		{
			System.out.println("Test Case is Passed");
			}
		else
		{
			System.out.println("Test case is Failed");
		}
		driver.close();
	}

}
