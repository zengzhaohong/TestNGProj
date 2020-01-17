package cn.gloryroad;

import org.testng.annotations.Test;

/**
 * 
 * @author zengzhaohong
   * ��������
 * ����������˳��ִ�У��������ķ���ִ�к󣬲��ܱ�ִ��
 * ���磺ִ��OpenBrowser���ִ��SingIn 
 */
public class DependentTest {

	@Test(dependsOnMethods= {"OpenBrowser"})
	public void SingIn() {
		System.out.println("SingIn����������");
	}
	
	@Test
	public void OpenBrowser() {
		System.out.println("OpenBrowser����������");
	}
	
	@Test(dependsOnMethods= {"SingIn"})
	public void LogOut() {
		System.out.println("LogOut����������");
	}
}
