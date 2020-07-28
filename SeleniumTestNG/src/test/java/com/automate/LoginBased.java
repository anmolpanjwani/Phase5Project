package com.automate;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginBased {
	
	@Test (priority = 2)
	@Parameters({"email","password"})
	  public void Login(String email, String password) throws InterruptedException {
		if(email.equals("harryjamespotter@gmail.com") && password.equals("MischiefManaged@007")) {
			System.out.println("Login will happen successfully");
			System.setProperty("webdriver.chrome.driver","D:\\Program Files\\Drivers\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http://automationpractice.com/index.php");
			  driver.findElement(By.className("login")).click();
			  Thread.sleep(3000);
//			  String email = "harryjpotter@gmail.com";
//			  String password = "MischiefManaged@007";
			  driver.findElement(By.id("email")).sendKeys(email);
			  driver.findElement(By.id("passwd")).sendKeys(password);
			  driver.findElement(By.id("SubmitLogin")).click();
			  Thread.sleep(5000);
			  driver.close();
			  driver.quit();
		}
		else {
			System.out.println("You need to enter correct credentials to login!");
		}
		  
	  }
	  @Test (priority = 3)
	  public void SearchandAddToCart() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","D:\\Program Files\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://automationpractice.com/index.php");
		  
		  
//		  driver.findElement(By.className("login")).click();
//		  Thread.sleep(3000);
//		  String email = "harryjamespotter@gmail.com";
//		  String password = "MischiefManaged@007";
//		  driver.findElement(By.id("email")).sendKeys(email);
//		  driver.findElement(By.id("passwd")).sendKeys(password);
//		  driver.findElement(By.id("SubmitLogin")).click();
		  Thread.sleep(3000);
		  
		  
		  driver.findElement(By.id("search_query_top")).sendKeys("dress");
		  
		  driver.findElement(By.name("submit_search")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@title='Printed Summer Dress']")).click();
		  
		  Thread.sleep(3000);
		  System.out.println("clicked on dress");
		  //driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//div//form//div//div[3]//div[1]//p//button[@type='submit']")).click();
		  Thread.sleep(3000);
		  System.out.println("added to cart");
		  driver.findElement(By.xpath("//span[@title='Close window']")).click();
		  System.out.println("close the view");
		  driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		  Thread.sleep(3000);
		  WebElement element = driver.findElement(By.xpath("//div//table//tfoot//tr[7]"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(element);
		  actions.perform();
		  System.out.println("See the cart");
		  Thread.sleep(2000);
		  driver.close();
		  driver.quit();
	  }
}
