package org.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 
{
	public static void main(String[] args)
	{
	//Set the property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\praveenkumar\\eclipse-workspace\\SridharProject\\driver\\chromedriver.exe");
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	//Load url
	driver.get("http://demo.automationtesting.in/Register.html");
	 
	 WebElement txtFirstName =  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	 txtFirstName.sendKeys("Sridhar");
	 WebElement txtSecondName =  driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	 txtSecondName.sendKeys("Socrates");
	 WebElement txtAddress =  driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	 txtAddress.sendKeys("Chennai");
	 WebElement txtEmail =  driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	 txtEmail.sendKeys("sri@gmail.com");
	 WebElement txtPhone =  driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	 txtPhone.sendKeys("8883236170");
	 WebElement rdoGender =  driver.findElement(By.xpath("//input[@value='Male']"));
	 rdoGender.click();
	 WebElement chkHobbies =  driver.findElement(By.id("checkbox1"));
	 chkHobbies.click();
	 WebElement txtFirstPassword =  driver.findElement(By.id("firstpassword"));
	 txtFirstPassword.sendKeys("sri123");
	 WebElement txtSecondPassword =  driver.findElement(By.id("secondpassword"));
	 txtSecondPassword.sendKeys("sri123");
	}
}
