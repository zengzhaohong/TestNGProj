package cn.gloryroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author zengzhaohong
 *断言测试
 */
public class AssertTest {

	public WebDriver webDriver;
	
	String baseUrl = "http://www.sogou.com/";
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.firefox.bin","E:\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		webDriver = new FirefoxDriver();
	}
	
	@Test
	public void testSogouSearch() {
		webDriver.get(baseUrl+"/");
		WebElement inputBox = webDriver.findElement(By.id("query"));
		
		/*使用Assert类中assertTrue方法断言搜索输入框是否在页面显示
		 * isDisplayed()判断是否显示，返回boolean类型
		 * assertTrue()判断是否为true
		 */
		Assert.assertTrue(inputBox.isDisplayed());
		
		inputBox.sendKeys("光荣之路自动化测试");
		webDriver.findElement(By.id("stb")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		webDriver.quit();
	}
}
