package cn.gloryroad;

import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author zengzhaohong
 *��־���
 */
public class ReporterTest {

	@Test
	public void OpenBrowser() {
		System.out.println("OpenBrowser����������");
		Reporter.log("�����������������");
	}
	
	@Test
	public void SingIn() {
		System.out.println("SingIn����������");
		Reporter.log("���õ�¼����");
	}
	
	@Test
	public void LogOut() {
		System.out.println("LogOut����������");
		Reporter.log("����ע������");
	}
}
