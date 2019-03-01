package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.name("journey_date")).click();
		datePick("27");
	}
	public static void datePick(String name) {
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement w = rows.get(i);
			List<WebElement> cols = w.findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				WebElement c = cols.get(j);
				String date = c.getText();

				if (date.equals(name)) {
					System.out.println("in");
					c.findElement(By.xpath("a")).click();

					break;
				}

			}
		}

	}

}
