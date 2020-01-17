package cn.gloryroad;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void testCase1() {
		System.out.println("执行测试用例1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("执行测试用例2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("执行测试用例3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("在每个测试方法开始运行前执行beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("在所有测试方法结束后执行afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("在当前类的第一个测试方法开始调用前执行beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("在当前类的最后一个测试方法结束运行后执行afterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("在测试类中的Test开始运行前执行beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("在测试类中的Test运行结束后执行afterTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("在当前测试集合中的所有测试程序开始运行前执行beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("在当前测试集合中所有测试程序裕兴结束后执行afterSuite");
	}
}
