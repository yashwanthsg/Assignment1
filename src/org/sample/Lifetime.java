package org.sample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lifetime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		WebElement locations = driver.findElement(By.xpath("//body/header/div[2]/div/nav/ul[1]/li[1]"));
		locations.click();
		List<WebElement> locationstit = driver.findElements(By.xpath("//nav[@aria-label='Primary Navigation']/ul/li[1]/div[2]/ul[1]"));
		for (WebElement x : locationstit) {
			System.out.println(x.getText());
			
		}
		WebElement membership = driver.findElement(By.xpath("//li[@class='nav-item  dropdown'][1]"));
		membership.click();
		List<WebElement> membershiptit = driver.findElements(By.xpath("//nav[@aria-label='Primary Navigation']/ul/li[2]/div[2]/ul[1]"));
		for (WebElement title : membershiptit) {
			System.out.println(title.getText());
			
		}
		
	}
}
