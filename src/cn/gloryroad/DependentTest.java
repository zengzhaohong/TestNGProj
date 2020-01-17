package cn.gloryroad;

import org.testng.annotations.Test;

/**
 * 
 * @author zengzhaohong
   * 依赖测试
 * 按照依赖的顺序执行，当依赖的方法执行后，才能被执行
 * 例如：执行OpenBrowser后才执行SingIn 
 */
public class DependentTest {

	@Test(dependsOnMethods= {"OpenBrowser"})
	public void SingIn() {
		System.out.println("SingIn方法被调用");
	}
	
	@Test
	public void OpenBrowser() {
		System.out.println("OpenBrowser方法被调用");
	}
	
	@Test(dependsOnMethods= {"SingIn"})
	public void LogOut() {
		System.out.println("LogOut方法被调用");
	}
}
