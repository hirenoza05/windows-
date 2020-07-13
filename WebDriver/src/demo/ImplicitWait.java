package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.partialLinkText("Example 1")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish > h4")));
		
		
				String actualText=driver.findElement(By.cssSelector("#finish > h4")).getText();
		
		String expectedText= "Hello World!";
		
		if(actualText.equals(expectedText))
		{
			System.out.println("Test Case is Passed");
					}
		else
		{
			System.out.println("Test Case is Failed");
		}
		driver.close();
		
	}
	

}
