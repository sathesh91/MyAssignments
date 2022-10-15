package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumInitial {

	public static void main(String[] args) {

 		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("Demosalesmanager");
		 WebElement passWord = driver.findElement(By.id("password"));
		 passWord.sendKeys("crmsfa");		 
		 WebElement logIn = driver.findElement(By.className("decorativeSubmit"));
		 logIn.click();
		 WebElement cmrSfa = driver.findElement(By.linkText("CRM/SFA"));
		 cmrSfa.click();
		 WebElement leaDs = driver.findElement(By.linkText("Leads"));
		 leaDs.click();
		 WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		 createLead.click();
		 WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		 companyName.sendKeys("Photon");
		 WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 FirstName.sendKeys("SatheshKumar");
		 WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		 lastName.sendKeys("Madhavan");
		 WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		 createLeadButton.click();
		 driver.close();
	}

}
