package co.locator.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\win-10\\eclipse-workspace\\sj_demo\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/ref=nav_logo");
			driver.manage().window().maximize();
			int pic_count = driver.findElements(By.className("a-carousel-card")).size();
			System.out.println(pic_count);
			int likies=driver.findElements(By.tagName("a")).size();
			System.out.println(likies);
			


}
}
