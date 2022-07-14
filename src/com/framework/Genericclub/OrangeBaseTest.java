package com.framework.Genericclub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.keywordDriven.OrangeProperties;

public class OrangeBaseTest {
	public WebDriver driver;
	public OrangeProperties f=new OrangeProperties();
@BeforeClass
public void openBrowser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Framework112\\src\\Jars\\chromedriver.exe");
	 driver=new ChromeDriver();
    driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Thread.sleep(2000);
   driver.get(f.fetchpro("url1"));
}
@BeforeMethod

	public void login() throws Throwable {
		
		driver.findElement(By.xpath("//span[@class='form-hint']")).sendKeys(f.fetchpro("username1"),Keys.TAB,f.fetchpro("password1"),Keys.ENTER);
	   
	}
@Test

	public void tc1() throws Throwable {
		 driver.findElement(By.xpath("//b[text()='Admin']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
}
}
