package cn.gloryroad;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

/**
 * 
 * @author zengzhaohong
 *操作浏览器窗口
 */
public class OperateBrowser {

	@Test
	public void operateBrowser() {
		/*声明Point对象，两个150表示浏览器的位置相对于屏幕左上角（0,0）的位置 */
		Point point = new Point(150,150);
	}
	
	
}
