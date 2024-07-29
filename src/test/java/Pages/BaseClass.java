package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Tests.Driver;

public class BaseClass extends Driver{
	public void SendkeysMethod(WebElement ele, String text) {
		ele.sendKeys(text);
		
	}
	public void ClickMethod(WebElement element) {
		element.click();
		
	}
    public String getTextMethod(WebElement ele) {
		return ele.getText();

}
    public void Dropdown(WebElement elem, String s) {
		Select se = new Select(elem);
		se.selectByVisibleText(s);	
	}
    public void waits(WebDriver driver,Duration time,By loc) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
}
