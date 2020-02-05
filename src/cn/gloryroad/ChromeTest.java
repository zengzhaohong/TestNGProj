package cn.gloryroad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {

	public WebDriver webDriver;
	String baseUrl = "http://www.sogou.com";
	
	@Test
	public void sogouSearch() {
		webDriver = new ChromeDriver();
		webDriver.get(baseUrl+"/");
	}
	
}
