package Pages;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login1 extends BaseClass{
	WebDriver driver;
	public Login1(WebDriver driver) {
		this.driver = driver;
	}
	By usern = By.id("user-name");
	By pass = By.id("password");
	By login    = By.id("login-button");
	By last = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By Title1 = By.xpath("(//div[@class='inventory_item_name '])[6]");
	By cart = By.xpath("//a[@class='shopping_cart_link']");
	By Title2 = By.xpath("//div[@class='inventory_item_name']");
	By remove = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
	By contin = By.id("continue-shopping");
	
	public void Credentials() {
		waits(driver, Duration.ofSeconds(10), usern);
		WebElement a = driver.findElement(usern);
		SendkeysMethod(a, "standard_user");
		WebElement p = driver.findElement(pass);
		SendkeysMethod(p, "secret_sauce");
		
	}

	//public void password(String Password) {
	//	waits(driver, Duration.ofSeconds(10), pass);
		
		
		
	public void Login() {
		waits(driver, Duration.ofSeconds(10), login);
		WebElement logn = driver.findElement(login);
		ClickMethod(logn);
	}
	public void LastProduct() {
		WebElement lastpro = driver.findElement(last);
		ClickMethod(lastpro);
	}
	public void Product_Validation() {
		WebElement text1 = driver.findElement(Title1);
		String s1 = getTextMethod(text1);
		System.out.println("Title of the productBefore:" +s1);	
	//public void CartIcon() {
		WebElement Cart = driver.findElement(cart);
		ClickMethod(Cart);
	//public void Product_TitleAfter(){
		WebElement text2 = driver.findElement(Title2);
		String s2=	getTextMethod(text2);
		System.out.println("Title of product After : " +s2);
		Assert.assertEquals(s2, s1);
		System.out.println("product validated");
		
	}
	public void Remove() {
		 waits(driver, Duration.ofSeconds(10),remove);
		WebElement re = driver.findElement(remove);
		ClickMethod(re);
	}
    public void Continue_shopping() {
    waits(driver, Duration.ofSeconds(10),contin);
	WebElement con = driver.findElement(contin);
	ClickMethod(con);
	try {
		Thread.sleep(3000);
			}catch(Exception e) {
		}
	
}

}
