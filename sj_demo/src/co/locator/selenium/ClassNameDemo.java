package co.locator.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win-10\\eclipse-workspace\\sj_demo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String data="demotest";
		driver.findElement(By.className("inputtext")).sendKeys("data");
		System.out.println("Used the class name locator successfully   "+ data);
		driver.close();
		

	}

}
