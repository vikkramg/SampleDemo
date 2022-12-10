package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_WebDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver","E:\\virtusa 2022\\chromedriver_win32 (1)\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
System.setProperty("webdriver.edge.driver","E:\\virtusa 2022\\edgedriver_win64\\msedgedriver.exe");
EdgeDriver Edriver=new EdgeDriver();
System.setProperty("webdriver.gecko.driver","E:\\virtusa 2022\\geckodriver-v0.31.0-win64\\geckodriver.exe");
FirefoxDriver Fdriver=new FirefoxDriver();/*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver Edriver=new EdgeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver Fdriver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String title1=driver.getTitle();
		if(title1.contains("Google"))
			System.out.println("The user is landed on the Homepage");
		else
			System.out.println("The user is not landed on the Homepage");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.hashCode());
		driver.navigate().to("http://www.flipkart.com");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Edriver.get("http://www.amazon.in");
		
		String title2=Edriver.getTitle();
		if(title2.contains("Amazon"))
			System.out.println("The user is landed on the Homepage");
		else
			System.out.println("The user is not landed on the Homepage");
		System.out.println(Edriver.getCurrentUrl());
		System.out.println(Edriver.getWindowHandle());
		Fdriver.get("http://www.unacademy.com");
		String title3=Fdriver.getTitle();
		if(title3.contains("Unacademy"))
			System.out.println("The user is landed on the Homepage");
		else
			System.out.println("The user is not landed on the Homepage");
		System.out.println(Fdriver.getCurrentUrl());
		System.out.println(Fdriver.getWindowHandle());
		driver.close();
		Edriver.close();
		Fdriver.close();
		}

}
