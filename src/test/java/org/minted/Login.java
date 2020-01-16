package org.minted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launchBrowser();
		URL("https://www.minted.com");
		waits();
		driver.findElement(By.xpath("//div[@class ='css-1943oeg']")).click();
		driver.findElement(By.xpath("//span[text() ='login']")).click();
		waits();
		driver.findElement(By.name("email")).sendKeys(Logins(5, 0));
		driver.findElement(By.name("password")).sendKeys(Logins(5, 1));
		driver.findElement(By.xpath("//span[text() ='SIGN IN']")).click();
		// screensshots("D:\\Selenium\\SeleniumScreen\\Minted.com\\loginpage5.png");
		waits();
		WebElement stationary = driver.findElement(By.xpath("//span[text() = 'stationery']"));
		actions(stationary);
		waits();
		WebElement weddings = driver
				.findElement(By.xpath("(//div[@class = 'small-10 columns secondary-nav__level-two__title'])[3]"));
		actions(weddings);
		driver.findElement(By.xpath("//a[@href='/wedding-invitations']")).click();
		waits();
        driver.findElement(By.xpath("//a[text() ='Gilded Eucalyptus']")).click();
		
	}
}
