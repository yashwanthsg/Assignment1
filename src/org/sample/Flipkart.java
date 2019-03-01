package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		mainMenu("2");
		//subMenu("2");
		subMenu2("2");
		
		
	}
	public static void mainMenu(String name) {
		String locator="//div[@class='_3zdbog _3Ed3Ub']/ul//li[@class='Wbt_B2 _1YVU3_'][$]";
		locator=locator.replace("$", name);
		WebElement w = driver.findElement(By.xpath(locator));
		Actions acc=new Actions(driver);
		acc.moveToElement(w).perform();

	}
	public static void subMenu(String name) throws Throwable {
		String locator="//div[@class='_3zdbog _3Ed3Ub']/ul//li[@class='Wbt_B2 _1YVU3_'][1]//ul[@class='QPOmNK']//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//following-sibling::li[@class='_1KCOnI _3ZgIXy']//following-sibling::li[$]/a";
		
	locator=locator.replace("$", name);
	//WebDriverWait wait=new WebDriverWait(driver, 50);
	WebElement w = driver.findElement(By.xpath(locator));
	//wait.until(ExpectedConditions.elementToBeClickable(w));
	Thread.sleep(5000);
	Actions acc=new Actions(driver);
	acc.moveToElement(w).perform();
	acc.doubleClick(w).perform();
	System.out.println("in");

	}
	public static void subMenu2(String name) throws Throwable {
	
		String loc="//li[@class='Wbt_B2 _1YVU3_'][2]//ul[@class='QPOmNK'][1]/li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy'][1]//following-sibling::li[$]/a";
		loc=loc.replace("$", name);
		WebElement x = driver.findElement(By.xpath(loc));
		Thread.sleep(5000);
		Actions acc=new Actions(driver);
		acc.moveToElement(x).perform();
		acc.doubleClick(x).perform();
		System.out.println("television");
		
		
		
	}
	
	
}
