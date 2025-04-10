import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.GenericLibrary.javaScript_Executor_Utility;

public class Program extends  Base_Class
{
	@Test
	public void testCase() {
		driver.get("https://www.swiggy.com/");
		javaScript_Executor_Utility.Scroll_BottomWebPage();
		System.out.println("hai");
	}

}
