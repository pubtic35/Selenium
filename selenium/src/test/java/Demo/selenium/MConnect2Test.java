package Demo.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MConnect2Test {
	  public WebDriver driver;
	  public String baseUrl;
	  public boolean acceptNextAlert = true;
	  public StringBuffer verificationErrors = new StringBuffer();
	  JavascriptExecutor js;
	  @Before
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void testMConnect() throws Exception {
		    System.setProperty("webdriver.chrome.driver", "");
		    driver = new ChromeDriver();
		    baseUrl = "https://www.google.com/";
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    js = (JavascriptExecutor) driver;
		  driver.get("https://profil.mconnect.mc/home?lang=fr");
	    driver.findElement(By.linkText("Créer ou gérer mon profil")).click();
	    driver.get("https://sc.mconnect.mc/login?response_type=code&scope=openid%20profile%20identity%20access&client_id=profil-revoke&state=OVRDhYDsExVKQA1D1aLJCmaBYlM&redirect_uri=https%3A%2F%2Fprofil.mconnect.mc%2Faccount%2Fredirect_uri&nonce=zB25VSTwLGHZTBrjFLNXEBIVyNrOYtQpMOSD_So5rtI&lang=fr");
	    driver.get("https://sc.mconnect.mc/login?response_type=code&scope=openid%20profile%20identity%20access&client_id=profil-revoke&state=OVRDhYDsExVKQA1D1aLJCmaBYlM&redirect_uri=https:%2F%2Fprofil.mconnect.mc%2Faccount%2Fredirect_uri&nonce=zB25VSTwLGHZTBrjFLNXEBIVyNrOYtQpMOSD_So5rtI&lang=fr");
	    isElementPresent(By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button/i"));
	    driver.findElement(By.xpath("//section[@id='loginPage']/div/div/div[5]/app-card-login/div[2]/div/div/div[2]/button/i")).click();
	    isElementPresent(By.xpath("//div[@id='pinModal']/div/div/div"));
	    isElementPresent(By.id("agreeInfosShared"));
	    driver.findElement(By.id("agreeInfosShared")).click();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span/input")).sendKeys("1");
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[2]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[2]/input")).sendKeys("4");
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[3]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[3]/input")).sendKeys("7");
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[4]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[4]/input")).sendKeys("8");
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[5]/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pinModal']/div/div/div/div[2]/div/div/code-input/span[5]/input")).sendKeys("9");
	    driver.get("https://profil.mconnect.mc/profile?lang=fr");
	    isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]"));
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).click();
	    assertEquals("Nom d'usage : DSN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Votre profil'])[1]/following::p[2]")).getText());
	    driver.findElement(By.linkText("Se déconnecter")).click();
	    isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::div[3]"));
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Non'])[1]/following::button[1]")).click();
	    driver.get("https://profil.mconnect.mc/home?lang=fr");
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}