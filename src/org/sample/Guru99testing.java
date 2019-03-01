package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> testing = driver.findElements(By.xpath("(//div[@class='moduletable '])[2]/div[2]/div[1]/div/h4[1]//following-sibling::ul[1]"));
		for (WebElement title : testing) {
			System.out.println(title.getText());
		}
		driver.quit();
	}
}
