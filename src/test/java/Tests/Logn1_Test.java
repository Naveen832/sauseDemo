package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import Pages.Login1;
public class Logn1_Test extends Driver {
	@Test
	public void LognMethod(){
		
		Login1 lo = new Login1(driver);
		lo.Credentials();
		lo.Login();
		lo.LastProduct();
		lo.Product_Validation();
		lo.Remove();
		lo.Continue_shopping();
		
	}
	
}	



