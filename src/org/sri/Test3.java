package org.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 
{
	public static void main(String[] args)
	{
	//Set the property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\g\\workspace\\Selenium\\driver\\chromedriver.exe");
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	//Load url
	driver.get("http://www.greenstechnologies.in/selenium-training.php");
	 
	 WebElement LinkCoreJava =  driver.findElement(By.xpath("//a[contains(text(),'Core JAVA  material')]"));
	 LinkCoreJava.click();
	
	}	 

}
