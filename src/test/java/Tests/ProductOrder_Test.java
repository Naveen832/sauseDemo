package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



import Pages.ProductOrder;

public class ProductOrder_Test extends Driver {
	@Test
	public void ProductOrderMethod() {
		ProductOrder po = new ProductOrder(driver);
		po.Product_1();
		po.Product_2();
		po.Product_3();
		po.Add_to_Cart();
		po.Checkout();
		po.Firstname();
		po.Lastname();
		po.Postal_Code();
		po.Continue();
		po.Finish();
	    po.Confirmation_Text();
	    po.Back();
		
	}

}
