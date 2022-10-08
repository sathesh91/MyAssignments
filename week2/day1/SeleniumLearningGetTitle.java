package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLearningGetTitle {

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
		 WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 firstNameLocal.sendKeys("satish");
		 WebElement departMent = driver.findElement(By.id("createLeadForm_departmentName"));
		 departMent.sendKeys("Testing");
		 WebElement descripTion = driver.findElement(By.id("createLeadForm_description"));
		 descripTion.sendKeys("Testing the website by automating using selenium tool");
		 WebElement eMail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 eMail.sendKeys("msatheshkumarbecsedep@gmail.com");
		 WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		 createLeadButton.click();
		 String viewLeadTitle = driver.getTitle();
		 System.out.println(viewLeadTitle);
		 //driver.close();

	}

}
