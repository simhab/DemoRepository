package Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class Dropdown {
	WebDriver driver;
	
@Test

		       public void selectBrowsers() throws InterruptedException {

		              
		              System.setProperty("webdriver.chrome.driver","C:\\Users\\simha\\Downloads\\chromedriver.exe");
		  	        WebDriver driver= new ChromeDriver();

		             driver.get("http://the-internet.herokuapp.com/dropdown");
		             
		             WebElement dropdown = driver.findElement(By.id("dropdown"));
		             driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		             Select select = new Select(dropdown);
		             select.selectByVisibleText("Option 1");
                      // select by visible text
		             
		             //select.selectByVisibleText("Option 1");
		             
		             // select by visible value 
		             
		             //select.selectByValue("2");
		             
		             // select by Index 
		             
		            // select.selectByIndex(2);
		             
		             Thread.sleep(5000);
		             driver.close();
		             
		             // Need to use when their are multiple select in a dropdown
		             
		             //select.deselectByIndex(2);
		             
		                    }

		}












