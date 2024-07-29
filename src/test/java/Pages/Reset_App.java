package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Tests.Driver;

public class Reset_App extends BaseClass{
    WebDriver driver;
    public Reset_App(WebDriver driver) {
    	this.driver=driver;
	}
    By drop = By.xpath("//select[@class='product_sort_container']");
    By item_1 = By.id("add-to-cart-sauce-labs-backpack");
    By item_2 = By.id("add-to-cart-sauce-labs-bike-light");
    By item_3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By crticon = By.xpath("//a[@class='shopping_cart_link']/child::span[text()=3]");
    By menubar = By.id("react-burger-menu-btn");
    By reset = By.id("reset_sidebar_link");
    By icon = By.xpath("//a[@class='shopping_cart_link']");
    
    
    public void Item_1() {
    	WebElement i1 = driver.findElement(item_1);
    	ClickMethod(i1);
    	
    }
    public void Item_2() {
    	WebElement i2 = driver.findElement(item_2);
    	ClickMethod(i2);
    }
    public void Item_3() {
    	WebElement i3 = driver.findElement(item_3);
    	ClickMethod(i3);
    }
    public void Menu_bar() {
    	WebElement mbar = driver.findElement(menubar);
    	ClickMethod(mbar);
    	try {
			Thread.sleep(3000);
			}catch(Exception e) {
			}
    	
    }
    public void Reset_App() {
    	WebElement reapp = driver.findElement(reset);
    	ClickMethod(reapp);
    	
    }
}

