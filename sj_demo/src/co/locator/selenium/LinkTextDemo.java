package co.locator.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win-10\\eclipse-workspace\\sj_demo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dcomputers-intl-ship&field-keywords=&ref=nb_sb_noss&crid=2KVHNSE3N15MU&sprefix=%2Cdigital-music%2C455");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Apple Pencil (2nd Generation)")).click();

	}

}
