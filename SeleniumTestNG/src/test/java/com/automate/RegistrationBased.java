package com.automate;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationBased {
  
	@Test (priority = 1, groups= {"RegisterGroup"})
  public void Registration() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  driver.findElement(By.className("login")).click();
	  Thread.sleep(3000);
	  String email = "harryjamespotter@gmail.com";
	  String password = "MischiefManaged@007";
	  driver.findElement(By.id("email_create")).sendKeys(email);
	  driver.findElement(By.id("SubmitCreate")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("id_gender1")).click();
	  String firstname = "Harry";
	  String lastname = "Potter";
	  driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
	  driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
	  driver.findElement(By.id("passwd")).sendKeys(password);
	  new Select(driver.findElement(By.cssSelector("select#days"))).selectByValue("31");
	  new Select(driver.findElement(By.cssSelector("select#months"))).selectByValue("7");
	  new Select(driver.findElement(By.cssSelector("select#years"))).selectByValue("1980");
	  driver.findElement(By.id("newsletter")).click();
	  driver.findElement(By.id("optin")).click();
	  driver.findElement(By.id("firstname")).sendKeys(firstname);
	  driver.findElement(By.id("lastname")).sendKeys(lastname);
	  driver.findElement(By.id("company")).sendKeys("Hogwarts School of Witchcraft and Wizardry");
	  driver.findElement(By.id("address1")).sendKeys("4 Privet Drive, Little Whinging,");
	  driver.findElement(By.id("city")).sendKeys("Surrey");
	  new Select(driver.findElement(By.cssSelector("select#id_state"))).selectByValue("53");
	  driver.findElement(By.id("postcode")).sendKeys("12345");
	  new Select(driver.findElement(By.cssSelector("select#id_country"))).selectByValue("21");
	  driver.findElement(By.id("other")).sendKeys("It matters not what someone is born, but what they grow to be.");
	  driver.findElement(By.id("phone")).sendKeys("0250-2339662");
	  driver.findElement(By.id("phone_mobile")).sendKeys("9876543210");
	  driver.findElement(By.id("alias")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("alias")).sendKeys("Hogwarts");
	  driver.findElement(By.id("submitAccount")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("logout")).click();
	  Thread.sleep(5000);
	  driver.close();
	  driver.quit();
  }

 }


