package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumInteractWithDifferentInput {

	public static void main(String[] args) {

           WebDriverManager.chromedriver().setup();
           ChromeDriver driver = new ChromeDriver();
           driver.get("https://www.leafground.com/input.xhtml");
           driver.manage().window().maximize();      
           
           WebElement typeYourName= driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
           typeYourName.sendKeys("Satheshkumar Madhavan");
            
           WebElement getValueOfAttr = driver.findElement(By.xpath("//input[@value='Chennai']"));
           String getText =  getValueOfAttr.getText();
           StringBuffer sb = new StringBuffer(", India");
           sb.append(getText);
           getValueOfAttr.sendKeys(sb);
           
           WebElement disabledFieldVerification = driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
           Boolean fieldDisbaleVerification = disabledFieldVerification.isDisplayed();
           if(fieldDisbaleVerification)
           System.out.println("Element is Disabled");
           else
        	   System.out.println("Element is Enabled");
           
           WebElement clearField = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
           clearField.clear();
           
           WebElement retriveText = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
           String fieldText = retriveText.getAttribute("value");
           System.out.println("Retrived the WebElement text is : "+fieldText);
           
           WebElement typeYourMail= driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
           typeYourMail.sendKeys("msatheshkumarbe@gmail.com"+Keys.TAB);
           
           WebElement aboutYourself = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
           aboutYourself.sendKeys("About myself, Satheshkumar Madhavan");
           
           WebElement confirmMessage = driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input"));
           confirmMessage.sendKeys(Keys.ENTER);
           WebElement verifyErrorMessage = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
           String errorMessage = verifyErrorMessage.getText();
           if(errorMessage.contains("Age is mandatory"))
        	   System.out.println("Error message is displayed");
           else
        	   System.out.println("Error message is not displayed");
           driver.close();

	}

}