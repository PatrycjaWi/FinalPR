package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	public WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;

	}

	public void GetBasePage() {

		driver.get("http://demo.guru99.com/");

	}
	
	

	
	

}
