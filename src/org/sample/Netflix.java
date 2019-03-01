package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://media.netflix.com/en/");
		WebElement login = driver.findElement(By.xpath("//div[@class='nav-center'][1]/ul[1]/li[2]/a"));
		login.click();
		WebElement signin = driver.findElement(By.xpath("//div[@class='netflix-authentication__container__actions fixed-width-buttons'][2]/a[1]"));
		signin.click();
		WebElement errormessage = driver.findElement(By.xpath("//div[@class='ping-messages']"));
		String text = errormessage.getText();
		System.out.println(text);
		driver.quit();
	}
	
}
