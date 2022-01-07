package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sakthibalan\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement username = driver.findElement(By.xpath("//label[@class='f0n8F '][1]"));

		username.sendKeys("reeach2sakthi@gmail.com");

		WebElement passwrd = driver.findElement(By.xpath("//input[@aria-label='Password']"));

		passwrd.sendKeys("12345678");

		WebElement button = driver.findElement(By.xpath("(//button[contains(@class, 'sqdOP')])[2]"));

		Thread.sleep(3000);
		button.click();

	}

}
