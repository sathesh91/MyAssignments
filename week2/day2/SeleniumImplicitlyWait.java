package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumImplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		WebElement createAccButton = driver.findElement(By.linkText("Create New Account"));
		createAccButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("satish");
		

	}

}
