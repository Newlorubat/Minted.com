package org.minted;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Register extends BaseClass {

	public static void main(String[] args) {

		launchBrowser();
		URL("https://www.minted.com/register");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("Ruban");
		driver.findElement(By.name("lastName")).sendKeys("AmalaEdwin");
		driver.findElement(By.name("email")).sendKeys("ruban.amalaedwin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("newlonrubat");
		driver.findElement(By.xpath("//button[text() = 'CREATE ACCOUNT']")).click();

	}

}
