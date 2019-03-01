package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		List<WebElement> java = driver.findElements(By.xpath("//div[@class='trainer-info'][3]/ul/li/ul/li[5]"));
		for (WebElement x : java) {
			System.out.println(x.getText());
		}

		driver.quit();

	}
}
