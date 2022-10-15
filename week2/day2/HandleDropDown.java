package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

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
		 WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		 firstName.sendKeys("SatheshKumar");
		 WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		 lastName.sendKeys("Madhavan");
		 //Handle the Drop Down by visible Text
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropDownSource = new Select(source);
		 dropDownSource.selectByVisibleText("Employee");
		//Handle the Drop Down by Value
		 WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dropDownIndustry = new Select(industry);
		 dropDownIndustry.selectByValue("IND_FINANCE");
		//Handle the Drop Down by Index
		 WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dropDownOwnerShip = new Select(ownerShip);
		 dropDownOwnerShip.selectByIndex(5);

	}

}
