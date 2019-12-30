package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99BankLoginTest {

	WebDriver driver;

	@Test
	public void SignIn_Test() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.demo.guru99.com/V4/");

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr239615");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mygaryq");

		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

	@Test
	public void verifyHomePageTitle() {
		System.out.println(driver.getTitle());

		driver.quit();
	}
}
