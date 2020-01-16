package cn.gloryroad;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestNGDemo {
	
	public WebDriver webDriver;
	//访问路径
	String baseUrl = "http://www.sogou.com/";
		
  @Test
  public void testSearch() {
	  //火狐浏览器访问路径
	  webDriver.get(baseUrl+"/");
	  //获取Sogou首页输入框元素并输入搜索内容
	  webDriver.findElement(By.id("query")).sendKeys("光荣之路自动化测试");
	  //获取搜索按钮，并点击
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
	  System.out.println("测试结束");
	  webDriver.quit();
  }

}
