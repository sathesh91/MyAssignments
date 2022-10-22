package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement okAlrt = driver.findElement(By.xpath("//div[@class='text-center col-xs-12']/button"));
		okAlrt.click();
		WebElement clickFlight = driver.findElement(By.partialLinkText("FLIGHTS"));
		clickFlight.click();
		Set<String> windowTitles = driver.getWindowHandles();
		List<String> listOfTitles = new ArrayList<String>(windowTitles);
		driver.switchTo().window(listOfTitles.get(1));
		String currentWindowTitle = driver.getTitle();
		System.out.println(currentWindowTitle);
		driver.close();
		driver.switchTo().window(listOfTitles.get(0));
		currentWindowTitle =driver.getTitle();
		System.out.println(currentWindowTitle);
			
		


	}

}
