package cn.gloryroad;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestNGDemo {
	
	public WebDriver webDriver;
	//����·��
	String baseUrl = "http://www.sogou.com/";
		
  @Test
  public void testSearch() {
	  //������������·��
	  webDriver.get(baseUrl+"/");
	  //��ȡSogou��ҳ�����Ԫ�ز�������������
	  webDriver.findElement(By.id("query")).sendKeys("����֮·�Զ�������");
	  //��ȡ������ť�������
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
	  System.out.println("���Խ���");
	  webDriver.quit();
  }

}
