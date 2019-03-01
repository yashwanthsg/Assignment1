package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bobcat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en/index");
		driver.findElement(By.xpath("//div[@class='col-sm-9']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-nav-type='Product Group'][3]")).click();
		Thread.sleep(2000);
		List<WebElement> elevator = driver.findElements(By.xpath("(//div[@class='items'])[3]"));
		Thread.sleep(2000);
		for (WebElement text : elevator) {
			System.out.println(text.getText());
		}

	}
}
