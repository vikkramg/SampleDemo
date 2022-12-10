package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_GoogleTest {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*WebDriverManager.edgedriver().setup();
		WebDriver Edriver=new EdgeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver Fdriver=new FirefoxDriver();*/
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("The Page landed in:"+title);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Amazon");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.name("btnK"));
		button.click();
		String title1=driver.getTitle();
		System.out.println("The Title:"+title1);

	}

}
