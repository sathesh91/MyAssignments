package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTheTiteOfPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Demosalesmanager");
		WebElement passWord = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		passWord.sendKeys("crmsfa");
		WebElement logIn = driver.findElement(By.xpath("//input[@value='Login']"));
		logIn.click();
        WebElement crmSfa = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
        crmSfa.click();
		WebElement leaDs = driver.findElement(By.xpath("//a[text()='Leads']"));
		leaDs.click();
		WebElement findLeads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeads.click();
		Thread.sleep(1000);
		WebElement enterFirstName = driver.findElement(By.xpath("//input[@id='ext-gen248']"));
		enterFirstName.sendKeys("Dennis");
		WebElement nameWithClickFindLeads = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		nameWithClickFindLeads.click();
		Thread.sleep(1000);
		WebElement firstRowListLead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		firstRowListLead.click();
		
		//Verify the Page Title
		String pageTitle = driver.getTitle();
		 if(pageTitle.contains("View Lead | opentaps CRM"))
			 System.out.println("Page Title is Verified: "+pageTitle);
		 else
			 System.out.println("Page Title is not looking similar!!! Try someother pages "+pageTitle);
		 
		 WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		 edit.click();
		 WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		 companyName.clear();
		 companyName.sendKeys("Photon");
		 WebElement updaTe = driver.findElement(By.xpath("//input[@value='Update']"));
		 updaTe.click();
		 WebElement companyNameVerification = driver.findElement(By.id("viewLead_companyName_sp"));
		 String verifycompanyName = companyNameVerification.getText();
		 //Verify the Updated CompanyName 
		 if(verifycompanyName.contains("Photon"))
			 System.out.println("Changed title got updated in the CompanyName field");
		 else
			 System.out.println("Changed title not reflected in the CompanyName field");
		    System.out.println("*************Test case pass Succesfully**************");
		 driver.close();
	}

}
