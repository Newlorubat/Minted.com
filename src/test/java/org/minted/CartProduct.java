package org.minted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartProduct extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launchBrowser();
		URL("https://www.minted.com/product/foil-stamped-wedding-invitations/MIN-ZQO-IFS/gilded-eucalyptus?color=A&greeting=&shape=default");
		// waits();
		// driver.findElement(By.xpath("//div[@class ='css-1943oeg']")).click();
		/*
		 * WebElement stationary =
		 * driver.findElement(By.xpath("//span[text() = 'stationery']"));
		 * actions(stationary); waits(); WebElement weddings = driver.findElement(By.
		 * xpath("(//div[@class = 'small-10 columns secondary-nav__level-two__title'])[3]"
		 * )); actions(weddings);
		 * driver.findElement(By.xpath("//a[@href='/wedding-invitations']")).click();
		 * 
		 * waits();
		 * driver.findElement(By.xpath("//a[text() ='Gilded Eucalyptus']")).click();
		 */
		waits();
		driver.findElement(By.xpath("(//a[text() ='personalize'])[2]")).click();
		// screensshots("D:\\Selenium\\SeleniumScreen\\Minted.com\\Cart1.png");

		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.id("finishedCheckbox")).click();
		driver.findElement(By.xpath("//span[text() ='add to cart']")).click();

	}

}
