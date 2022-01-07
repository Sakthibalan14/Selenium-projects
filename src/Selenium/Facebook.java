package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sakthibalan\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("sakthi1234@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("123456780");

		WebElement btn = driver.findElement(By.name("login"));

		btn.click();

		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(3000);
//		
//		
//		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'helps you')]"));
//
//		String text2 = text.getText();
//		System.out.println(text2);
//
//		boolean displayed = password.isDisplayed();
//		System.out.println(displayed);
//
//		password.clear();
//		password.sendKeys("sakthi");
//
//		String attribute = email.getAttribute("value");
//		System.out.println("using value:" + attribute);
//		String attribute2 = email.getAttribute("name");
//		System.out.println("using name:" + attribute2);
	}
}
