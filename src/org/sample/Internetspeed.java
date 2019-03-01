package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Internetspeed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fast.com/");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement speed = driver.findElement(By.xpath("//div[@id='your-speed-message']"));
		wait.until(ExpectedConditions.elementToBeClickable(speed));
		String name = speed.getText();
		if (name.equals("Your Internet speed is")) {
			WebElement fast = driver.findElement(By.xpath("//div[@class='speed-controls-container centered']"));
			System.out.println(fast.getText());
		}
		driver.quit();
	}
}
