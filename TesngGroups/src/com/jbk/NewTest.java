package com.jbk;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class NewTest {
	public static WebDriver driver = null;

	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver();
		driver.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");

	}

	@Test(priority = 1, groups = { "Regression Test", "Smoke Test" })
	public void verifyUrl() {
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String ExpectedURL = "file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html";
		Assert.assertEquals(ExpectedURL, URL);
	}

	@Test(priority = 2, groups = { "Smoke Test" })
	public void verifyTitle() {
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "JavaByKiran | Log in";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	@Test(priority = 3, groups = { "Regression Test" })
	public void SignInText() {
		String ActualText = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		System.out.println(ActualText);
		String ExpectedText = "Sign in to start your session";
		Assert.assertEquals(ExpectedText, ActualText);
	}

	@Test(priority = 4, groups = { "Smoke Test", "Sanity Test" })
	public void signInnButtonText() {
		String ActualText = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).getText();
		System.out.println(ActualText);
		String ExpectedText = "Sign In";
		Assert.assertEquals(ExpectedText, ActualText);
	}
}
