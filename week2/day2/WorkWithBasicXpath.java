package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithBasicXpath {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement userName = driver.findElement(By.xpath("//input[@class='inputLogin']"));
		 userName.sendKeys("Demosalesmanager");
		 WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		 passWord.sendKeys("crmsfa");		 
		 WebElement logIn = driver.findElement(By.xpath("//input[@value='Login']"));
		 logIn.click();
		 WebElement cmrSfa = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		 cmrSfa.click();
		 driver.close();
	}

}
