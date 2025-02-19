package Demo.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@Test
	public void testMConnect() throws Exception {
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://profil.mconnect.mc/home?lang=fr");
		driver.findElement(By.linkText("Créer ou gérer mon profil")).click();
		isElementPresent(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button"),
				driver);
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button"))
				.click();
		//driver.findElement(By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button")).click();
		driver.findElement(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button")).sendKeys(Keys.RETURN);
		driver.findElement(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button")).sendKeys(Keys.RETURN);
		isElementPresent(By.xpath("//div[@id='pinModal']/div/div/div"), driver);
		isElementPresent(By.id("agreeInfosShared"), driver);
		driver.findElement(By.id("agreeInfosShared")).click();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span/input")).clear();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span/input"))
				.sendKeys("1");
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[2]/input"))
				.clear();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[2]/input"))
				.sendKeys("4");
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[3]/input"))
				.clear();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[3]/input"))
				.sendKeys("7");
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[4]/input"))
				.clear();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[4]/input"))
				.sendKeys("8");
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[5]/input"))
				.clear();
		driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[5]/input"))
				.sendKeys("9");
		// driver.get("https://profil.mconnect.mc/profile?lang=fr");
		isElementPresent(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]"),
				driver);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).click();
	    assertEquals("Nom d'usage : DSN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).getText());
	    driver.findElement(By.linkText("Se déconnecter")).click();
	    isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::div[3]"),driver);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Non'])[1]/following::button[1]")).click();
	    driver.quit();

	}
	public static boolean isElementPresent(By by, WebDriver driver) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	@After
	public void tearDown() throws Exception {
	//	System.out.println("After");
	}

}