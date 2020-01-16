package org.minted;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RUBAN\\eclipse-workspace\\Minted.com\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void URL(String u) {

		driver.get(u);

	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static String Logins(int rowno, int cellno) throws Throwable {
		String v = null;
		File loc = new File("C:\\Users\\RUBAN\\eclipse-workspace\\Minted.com\\Excel\\Book1.xlsx");
		FileInputStream Stream = new FileInputStream(loc);
		Workbook book = new XSSFWorkbook(Stream);
		Sheet sheet = book.getSheet("Login");
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		if (type == 1) {
			v = cell.getStringCellValue();
		}

		else if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yy");
				v = sim.format(dateCellValue);
			}

			else {
				double numericCellValue = cell.getNumericCellValue();
				long i = (long) numericCellValue;
				v = String.valueOf(i);

			}
		}
		return v;
	}
	
	public static void actions(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	public static void screensshots(String screens) throws Throwable {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File Perman = new File(screens);
		FileUtils.copyFile(temp, Perman);

	}
	
	public static void javascript(WebElement e)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	
	public static void close()
	{
		driver.close();
	}
}
