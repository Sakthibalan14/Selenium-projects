package Selenium;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sakthibalan\\driver\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println(title);

		driver.navigate().to("https://www.google.co.in/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
}
