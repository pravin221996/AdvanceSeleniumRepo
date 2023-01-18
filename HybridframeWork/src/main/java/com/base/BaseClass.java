package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver = null;

	public void  intialization() throws Exception {
		
		String name = PropertiesUtils.readPropertey("browser");
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		     driver= new ChromeDriver();
		     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		     
	}
	   if(name.equalsIgnoreCase("firefox")) {
       System.setProperty("webdriver.firefox.driver","gekodriver.exe");
	   driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(PropertiesUtils.readPropertey("url"));
}}
