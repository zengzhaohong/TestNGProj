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
		System.out.println("beforeSuite:�ڵ�ǰ���Լ����е����в��Գ���ʼ����ǰִ��");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest:�ڲ������е�Test��ʼ����ǰִ��");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass:�ڵ�һ�����Է�������ǰִ��");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.firefox.bin","E:\\\\Mozilla Firefox\\\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
		webDriver = new FirefoxDriver();
		System.out.println("beforeMethod:��ÿһ�����Է�������ǰִ��");
	}
	
	@Test
	public void baiduTest() {
		baseUrl = "http://www.sogou.com";
		webDriver.get(baseUrl+"/");
		WebElement webElement = webDriver.findElement(By.id("query"));
		webElement.sendKeys("����֮·�Զ�������");
		webDriver.findElement(By.id("stb")).click();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod:ÿ�����Է���������ִ��");
	}
	
	
	
}
