package day1.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","F:\\acceleration\\eclipseprogram\\selenium\\executable\\chromedriver.exe");
       
       ChromeDriver cdriver=new ChromeDriver();
       
       cdriver.get("https://www.google.com");

	}

}