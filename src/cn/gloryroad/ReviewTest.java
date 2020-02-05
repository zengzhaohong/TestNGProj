package cn.gloryroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReviewTest {

	public WebDriver webDriver;
	public String baseUrl;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite:在当前测试集合中的所有测试程序开始运行前执行");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest:在测试类中的Test开始运行前执行");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass:在第一个测试方法调用前执行");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.firefox.bin","E:\\\\Mozilla Firefox\\\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
		webDriver = new FirefoxDriver();
		System.out.println("beforeMethod:在每一个测试方法运行前执行");
	}
	
	@Test
	public void baiduTest() {
		baseUrl = "http://www.sogou.com";
		webDriver.get(baseUrl+"/");
		WebElement webElement = webDriver.findElement(By.id("query"));
		webElement.sendKeys("光荣之路自动化测试");
		webDriver.findElement(By.id("stb")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod:每个测试方法结束后执行");
	}
	
	
	
}
