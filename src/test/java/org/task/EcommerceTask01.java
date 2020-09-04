package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceTask01 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver initialization
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAY KUMAR\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Maximizing the Window
		driver.manage().window().maximize();
		//Launching the WebPage
		driver.get("https://www.amazon.in/");
		//find the search box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone");
		WebElement searchIcon = driver.findElement(By.cssSelector("input[value='Go']"));
		searchIcon.click();
		Thread.sleep(3000);
		WebElement productSide = driver.findElement(By.xpath("//div[contains(@class,'matching')][1]"));
		List<WebElement> products = productSide.findElements(By.xpath("//span[contains(text(),'iPhone')]"));
		System.out.println(products.size());
		for (int i = 0; i < products.size(); i++) {
			WebElement productNames = products.get(i);
			String text = productNames.getText();
			System.out.println(text);
			
		}
	}
}
