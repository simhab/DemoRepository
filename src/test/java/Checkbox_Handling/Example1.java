package Checkbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {

    
    WebDriver driver;


    @Test
    public void selectOption() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\simha\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));


    checkbox1.click();


        
        
        
        
    }


    
    
    
    
}
 









