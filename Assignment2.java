package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
        driver.findElement(By.id("signin_button")).click();
		
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		
		//click on checkbox
		 driver.findElement(By.id("user_remember_me")).click();
		 
		 //by name
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
	     
		 //by ID
		  driver.findElement(By.id("details-button")).click();
	      driver.findElement(By.id("proceed-link")).click();
	        
	      //xpath by contains
	     driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
	     
	     Thread.sleep(1000);
	     
	     //xpath by partialLinkText
	     driver.findElement(By.partialLinkText("Add New Pay")).click();
	     Thread.sleep(1000);
	     
	   //CSS Selector by #id 
	     driver.findElement(By.cssSelector("#np_new_payee_name")).sendKeys("Vaibhav T");
	     Thread.sleep(1000);
	     
	   //CSS Selector By tag
	   // driver.findElement(By.cssSelector("textarea")).sendKeys("ABC STREET,XYZ AREA,CALIFORNIA");
	   //  Thread.sleep(1000);
	     
	    //  OR
	     
	  //  CSS Selector By tag+classname  =tag.classname
	   driver.findElement(By.cssSelector("textarea.span4")).sendKeys("ABC STREET,XYZ AREA,CALIFORNIA");
	   Thread.sleep(1000);
	  
	   //CSS Selector by tag+attribute = tag[attribute=value]
	  driver.findElement(By.cssSelector("input[name='account']")).sendKeys("1000 $");
	  Thread.sleep(1000); 
	  
	  //CCS Selector by tag+id= tag#id
	//  driver.findElement(By.cssSelector("input#np_new_payee_details")).sendKeys("Vibes");     
	//  Thread.sleep(1000);
	  
	  // OR ----->
	  // cp xpath 
	 driver.findElement(By.xpath("//input[@id='np_new_payee_details']")).sendKeys("Vibes");
	  
	 driver.findElement(By.cssSelector("#add_new_payee")).click();   //Added new Payee
	
	driver.findElement(By.partialLinkText("username")).click();
	
	driver.findElement(By.linkText("Logout")).click();      //Logout
	
	Thread.sleep(2000); 	
	  driver.close();
	  driver.quit();   //quit browser
		

	}

}
