package cn.gloryroad;

import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author zengzhaohong
 *日志输出
 */
public class ReporterTest {

	@Test
	public void OpenBrowser() {
		System.out.println("OpenBrowser方法被调用");
		Reporter.log("调用浏览器启动方法");
	}
	
	@Test
	public void SingIn() {
		System.out.println("SingIn方法被调用");
		Reporter.log("调用登录方法");
	}
	
	@Test
	public void LogOut() {
		System.out.println("LogOut方法被调用");
		Reporter.log("调用注销方法");
	}
}
