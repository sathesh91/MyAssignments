package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHandleFrame {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement handleFram = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(handleFram);
		WebElement clickTry = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		clickTry.click(); 
		Alert text = driver.switchTo().alert();
		text.sendKeys("sathesh");
		text.accept();
		String seeText = driver.findElement(By.xpath("//p[text()='Hello sathesh! How are you today?']")).getText();
		System.out.println(seeText);

	}

}
