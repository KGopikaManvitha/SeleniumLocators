package co.locator.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win-10\\eclipse-workspace\\sj_demo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Computers");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
