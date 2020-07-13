package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	
	
public static void main(String[] args) {
	
	System.getProperty("webdriver.chorme.driver","Chormedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	String actualresult=driver.getTitle();
	String expectedresult= "Google";
	
	if (actualresult.equals(expectedresult))
	{
		System.out.println("Open Google Home Page");
		
	}
	else
	{
		System.out.println("Cant load Google Home Page");
	}
	driver.close();
}
}
