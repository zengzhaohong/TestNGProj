package cn.gloryroad;

import org.testng.annotations.Test;

/*
 * 按照特定的顺序执行测试用例，使用参数priority(优先级)
 */
public class SequenceTest {
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("test3被执行");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("test2被执行");
	}
	
	@Test(priority = 3)
	public void test1() {
		System.out.println("test1被执行");
	}
}
