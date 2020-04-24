package RadioButton_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2
{
    
	
	
    
	WebDriver driver;


	    @Test
	    public void selectradiobutton() throws InterruptedException {
	        
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\simha\\Downloads\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	        
	        Thread.sleep(5000);
	        
	        
	        WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	        
	       WebElement radiobutton2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));


	        radiobutton1.click();
	        radiobutton2.click();
	        
	        
	    
	    }
	}
	 








