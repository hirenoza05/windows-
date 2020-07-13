package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chorme.driver", "chormedriver.exe"); //Open for Browser
		WebDriver driver = new ChromeDriver(); // Create New Method
		
		// WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/"); // open for application URL
		
		String actualTitle= driver.getTitle();
		String expectedTitle= "Facebook - Log In or Sign Up";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test is Pass"); 
		}
		else
		{
			System.out.println("Test is Failed");
		} 
		
	driver.close();
	}

}
