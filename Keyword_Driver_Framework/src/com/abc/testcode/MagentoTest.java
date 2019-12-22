package com.abc.testcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("/Users/amarmishra/Desktop/Engine/Selenium_Projects/Keyword_Driver_Framework/src/com/abc/utilities/keyword.properties");
		
		Properties p=new Properties();
		p.load(fis);
		String myacctlocator=p.getProperty("myacct");
		String emaillocator=p.getProperty("emaillocator");
		String pwd=p.getProperty("passlocator");
		String login=p.getProperty("loginlocator");
		String url="https://magento.com/";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText(myacctlocator)).click();
		driver.findElement(By.id(emaillocator)).sendKeys("amarmishra382@gmail.com");
		driver.findElement(By.id(pwd)).sendKeys("welcome123");
		driver.findElement(By.id(login)).click();		
		

	}

}
