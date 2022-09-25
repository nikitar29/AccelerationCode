package day1.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FireFox {
	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver","F:\\acceleration\\eclipseprogram\\selenium\\executable\\geckodriver.exe");
       
FireFox fdriver=new FireFox();
       
       fdriver.get("https://www.google.com");

	}

	private void get(String string) {
		// TODO Auto-generated method stub
		
	}

}
