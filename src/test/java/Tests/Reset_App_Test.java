package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.Reset_App;


public class Reset_App_Test extends Driver{

	@Test
	public void ResetAppMethod() {
		Reset_App reap = new Reset_App(driver);
		reap.Item_1();
		reap.Item_2();
		reap.Item_3();
		reap.Menu_bar();
		reap.Reset_App();
		
		
	}
}
