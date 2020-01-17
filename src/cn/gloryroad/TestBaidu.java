package cn.gloryroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBaidu {
	
	public WebDriver webDriver;
	
	String baseUrl = "http://sogou.com/";

	@Test
	public void testBaidu() {
		
		webDriver.get(baseUrl+"/");
		webDriver.findElement(By.id("query")).sendKeys("光荣之路自动化测试2");
		webDriver.findElement(By.id("stb")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		  System.setProperty("webdriver.firefox.bin","E:\\Mozilla Firefox\\firefox.exe");
		  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		webDriver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void afterMethod() {
		webDriver.quit();
	}
}
