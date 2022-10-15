package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownAndRadioButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		createNewAccount.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement userName = driver.findElement(By.xpath("//input[@name='firstname']"));
		userName.sendKeys("sathesh");
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("kuamr");
		WebElement mobOrEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobOrEmail.sendKeys("1234567890");
		WebElement passWord = driver.findElement(By.xpath("//input[@data-type='password']"));
		passWord.sendKeys("1234567890");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayDropDownValue = new Select(dayDropDown);
		dayDropDownValue.selectByIndex(28);
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthDropDownValue = new Select(monthDropDown);
		monthDropDownValue.selectByValue("12");		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearDropDownValue = new Select(yearDropDown);
		yearDropDownValue.selectByVisibleText("1991");	
		WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@type='radio']"));
	    radioButtonFemale.click();
	    driver.close();
	    System.out.println("*************Test case pass Succesfully**************");
	}

}
