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
 *TestNG并发兼容性测试，浏览器兼容测试
 */
public class MultipeBrowserSearchTest {
	
	public WebDriver webDriver;
	String baseUrl = "http://www.sogou.com";
	
	//@Parameters("browser")定义browser参数，参数从TestNG.xml配置文件中获取
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
		inputBox.sendKeys("光荣之路自动化测试");
		webDriver.findElement(By.id("stb")).click();
		//单击搜索等待一段时间。让页面完成演示过程
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//判断搜索结果中是否包含测试数据中期望的关键词
		Assert.assertTrue(webDriver.getPageSource().contains("光荣之路自动化测试"));
	}
	
	@AfterClass
	public void afterClass() {
		
	}
}
