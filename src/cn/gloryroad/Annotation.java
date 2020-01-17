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
		System.out.println("ִ�в�������1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("ִ�в�������2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("ִ�в�������3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("��ÿ�����Է�����ʼ����ǰִ��beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("�����в��Է���������ִ��afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("�ڵ�ǰ��ĵ�һ�����Է�����ʼ����ǰִ��beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("�ڵ�ǰ������һ�����Է����������к�ִ��afterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("�ڲ������е�Test��ʼ����ǰִ��beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("�ڲ������е�Test���н�����ִ��afterTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("�ڵ�ǰ���Լ����е����в��Գ���ʼ����ǰִ��beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("�ڵ�ǰ���Լ��������в��Գ���ԣ�˽�����ִ��afterSuite");
	}
}
