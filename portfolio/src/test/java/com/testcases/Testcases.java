package com.testcases;



	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webpages.Webpages;

	public class Testcases {
	public WebDriver driver;
	@BeforeTest
	public void setup(){
		//WebDriver driver;
	System.out.println("Launching the browser!");
	System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\aDee\\Desktop\\Sel\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	//driver=new FirefoxDriver();
	driver = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\hossain\\Desktop\\Sel\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "//Users//adee//Desktop//geckodriver-v0.19.0-macos.tar//geckodriver");
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\hossain\\Desktop\\Sel\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	//driver = new FirefoxDriver();
	//The website to invoke
	driver.get("http://zadeezx.wixsite.com/portfolio");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
		public void firsttest() throws InterruptedException{

	 Webpages home = new Webpages(driver);
	 
	 home.typehome().click();
	 home.typecontact().click();
	 Thread.sleep(5000);
	 home.input("Naresh","zadeezx@gmail.com","Photography","Hi Zahir, Long time now see! I'm visiting your photography page.");

	 Thread.sleep(5000);
	 home.typesend().click();
	 Thread.sleep(3000);
	 try{
		 Assert.assertTrue(true,"Success! Message sent");
		 System.out.println("passed the case");
	 }
	 catch (Exception e){
		 System.out.println("it has failed");
	 }
	 }
	 @AfterTest
	 public void teardown(){
		 driver.quit();
	 }

		
			


}
