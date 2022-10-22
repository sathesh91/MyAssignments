package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHandleAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement promptBox = driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]"));
		promptBox.click();
		
		Alert learnAlet = driver.switchTo().alert();
		learnAlet.sendKeys("Photon Interactive Private Limited");
		learnAlet.accept();

	}

}
