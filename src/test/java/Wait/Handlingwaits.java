package Wait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwaits {
	
    WebDriver driver;


	public void guru99tutorials() throws InterruptedException 

	            {
		 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\simha\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://demo.guru99.com/test/guru99home/" );
        
              // String eTitle = "Demo Guru99 Page";

	           // String aTitle = "" ;
	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;


	            // launch Chrome and redirect it to the Base URL
	            
	            
	            //Maximizes the browser window

	            driver.manage().window().maximize() ;

	            //get the actual value of the title

	          //  aTitle = driver.getTitle();

	            //compare the actual title with the expected title

	          //  if (aTitle.equals(eTitle))

	           // {

	            System.out.println( "Test Passed") ;

	          //  }

	          //  else {

	          //  System.out.println( "Test Failed" );

	           // }

	            //close browser

	            driver.close();

	}

	}





