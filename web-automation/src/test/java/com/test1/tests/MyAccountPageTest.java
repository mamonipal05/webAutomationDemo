package com.test1.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageTest {
	private WebDriver driver;
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium JARS\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
  @Test
  public void f() {
	  driver.get("https://www.flipcart.com");
	  //driver.findElement(By.id("user-message")).sendKeys("mamoni");
	  //driver.findElement(By.linkText("Show Message")).click();
  }
	@AfterMethod
	public void after() {
			driver.quit();
			
		}
  }

