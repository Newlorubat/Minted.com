package org.minted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CartProduct extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launchBrowser();
		URL("https://www.minted.com/");
		waits();
		driver.findElement(By.xpath("//div[@class ='css-1943oeg']")).click();

		WebElement stationary = driver.findElement(By.xpath("//span[text() = 'stationery']"));
		actions(stationary);
		waits();
		WebElement weddings = driver
				.findElement(By.xpath("(//div[@class = 'small-10 columns secondary-nav__level-two__title'])[3]"));
		actions(weddings);
		driver.findElement(By.xpath("//a[@href='/wedding-invitations']")).click();
		waits();
		driver.findElement(By.xpath("//a[text() = 'Forest Crest']")).click();
		driver.manage().deleteAllCookies();
		waits();
		driver.findElement(By.xpath("(//a[text() ='personalize'])[2]")).click();
		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.xpath("(//span[text() ='next'])[1]")).click();
		waits();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[3]/ul[2]/li/a")).click();
		waits();
		driver.findElement(By.id("finishedCheckbox")).click();
		waits();
		driver.findElement(By.xpath("//span[text() ='add to cart']")).click();
		waits();
		driver.findElement(By.xpath("(//a[@class ='checkoutButton floatR btn'])[1]")).click();
		waits();
		driver.findElement(By.name("email")).sendKeys(Logins(5, 0));
		driver.findElement(By.name("password")).sendKeys(Logins(5, 1));
		driver.findElement(By.xpath("//span[text() ='SIGN IN']")).click();
		waits();
		driver.findElement(By.xpath("//input[@id ='SHIPPING_ADDRESS.firstName']")).sendKeys("Ruban");
		driver.findElement(By.id("SHIPPING_ADDRESS.lastName")).sendKeys("Amalaedwin");
		driver.findElement(By.id("SHIPPING_ADDRESS.address1")).sendKeys("Vandiyur");
		driver.findElement(By.id("SHIPPING_ADDRESS.city")).sendKeys("Madurai");
		waits();
		WebElement state = driver.findElement(By.id("SHIPPING_ADDRESS.state"));
		Select s = new Select(state);
		s.selectByVisibleText("FM");
		driver.findElement(By.id("SHIPPING_ADDRESS.zipcode")).sendKeys("625001");
		waits();
		WebElement country = driver.findElement(By.id("SHIPPING_ADDRESS.state"));
		Select sc = new Select(country);
		sc.selectByVisibleText("United States");
		driver.findElement(By.id("SHIPPING_ADDRESS.phone")).sendKeys("9790478928");

	}

}
