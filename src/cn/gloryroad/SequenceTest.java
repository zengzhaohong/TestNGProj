package cn.gloryroad;

import org.testng.annotations.Test;

/*
 * �����ض���˳��ִ�в���������ʹ�ò���priority(���ȼ�)
 */
public class SequenceTest {
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("test3��ִ��");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("test2��ִ��");
	}
	
	@Test(priority = 3)
	public void test1() {
		System.out.println("test1��ִ��");
	}
}
