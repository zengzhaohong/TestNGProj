package cn.gloryroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 
 * @author zengzhaohong
 *TestNG���������Բ��ԣ���������ݲ���
 */
public class MultipeBrowserSearchTest {
	
	public WebDriver webDriver;
	String baseUrl = "http://www.sogou.com";
	
	//@Parameters("browser")����browser������������TestNG.xml�����ļ��л�ȡ
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String Browser) {
		if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.bin","E:\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			webDriver = new FirefoxDriver();
		}else {
			webDriver = new ChromeDriver();
		}
	}
	
	@Test
	public void testSogouSearch() {
		webDriver.get(baseUrl+"/");
		WebElement inputBox = webDriver.findElement(By.id("query"));
		Assert.assertTrue(inputBox.isDisplayed());
		inputBox.sendKeys("����֮·�Զ�������");
		webDriver.findElement(By.id("stb")).click();
		//���������ȴ�һ��ʱ�䡣��ҳ�������ʾ����
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//�ж�����������Ƿ�������������������Ĺؼ���
		Assert.assertTrue(webDriver.getPageSource().contains("����֮·�Զ�������"));
	}
	
	@AfterClass
	public void afterClass() {
		
	}
}
