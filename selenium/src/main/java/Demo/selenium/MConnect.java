package Demo.selenium;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MConnect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://profil.mconnect.mc/profile?lang=fr");
		
		LocalDateTime now = LocalDateTime.now();
		// Define the format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// Format the current date and time
		String formattedNow = now.format(formatter);
		
		System.out.println(now.format(formatter));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		formattedNow = now.format(formatter);
		System.out.println(now.format(formatter));
		// driver.get("https://sc.mconnect.mc/login?response_type=code&scope=openid%20profile%20identity%20access&client_id=profil-revoke&state=ZynuJNH4aBQdjwhWnHtjcFQpZoM&redirect_uri=https%3A%2F%2Fprofil.mconnect.mc%2Faccount%2Fredirect_uri&nonce=UtWA4ydEXW5Rxo-MSKSGUvW3KsLnLbG0LegrxtMgzyY&lang=fr");
		// driver.get("https://sc.mconnect.mc/login?response_type=code&scope=openid%20profile%20identity%20access&client_id=profil-revoke&state=ZynuJNH4aBQdjwhWnHtjcFQpZoM&redirect_uri=https:%2F%2Fprofil.mconnect.mc%2Faccount%2Fredirect_uri&nonce=UtWA4ydEXW5Rxo-MSKSGUvW3KsLnLbG0LegrxtMgzyY&lang=fr");
		driver.findElement(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button/i"))
				.click();
		System.out.println(now.format(formatter));
		driver.findElement(
				By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button/i"))
				.click();
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
		driver.get("https://profil.mconnect.mc/profile?lang=fr");
		driver.findElement(By.xpath("//div[2]/a")).click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Non'])[1]/following::button[1]"))
				.click();
		driver.get("https://profil.mconnect.mc/home?lang=fr");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Profil'])[1]/preceding::app-loading-spinner[1]"))
				.click();
	}
}