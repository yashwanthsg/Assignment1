package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		gotoPage("6");

	}

	public static void gotoPage(String pageNum) {
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='nav']//td"));
		for (int i = 0; i < cols.size(); i++) {
			if (cols.get(i).getText().equals(pageNum)) {
				cols.get(i).findElement(By.tagName("a")).click();
				break;
			}
		}
		driver.quit();
	}
}
