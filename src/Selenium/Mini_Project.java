package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();

		WebElement email1 = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView();", email1);

		email1.sendKeys("vaijushanthi@gmail.com");

		WebElement pword1 = driver.findElement(By.id("passwd"));
		pword1.sendKeys("tanu@01");

		WebElement submitlogin = driver.findElement(By.id("SubmitLogin"));
		submitlogin.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();

		WebElement casualdresses = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		casualdresses.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement addtocart = driver.findElement(By.xpath("//a[@title='Add to cart']"));

		js.executeScript("arguments[0].scrollIntoView();", addtocart);
		js.executeScript("arguments[0].click();", addtocart);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0, 1000)");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement qty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		qty.sendKeys("5");

		WebElement Proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		Proceed.click();
		WebElement proceed1 = driver.findElement(By.name("processAddress"));
		proceed1.click();

		WebElement checkbox = driver.findElement(By.className("checker"));
		checkbox.click();

		WebElement proceed2 = driver.findElement(By.name("processCarrier"));
		proceed2.click();

		WebElement bankwire = driver.findElement(By.className("bankwire"));
		bankwire.click();

		WebElement confirm2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm2.click();

	}

}
