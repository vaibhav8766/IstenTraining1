package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		      Thread.sleep(2000);
		      
		      String CurrentUrl= driver.getCurrentUrl();
		      System.out.println(CurrentUrl);
		      
		      driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		      Thread.sleep(1000);
		      
		      driver.findElement(By.linkText("Purchase Foreign Currency")).click();
		      
		      driver.findElement(By.xpath("//input[@id='purchase_cash']")).click();
		      Thread.sleep(1000);
				
			   Alert Alert =driver.switchTo().alert();
			   System.out.println("The alert is "+ Alert);
			   
			   Thread.sleep(1000);

				
			  Alert.accept();
			  Thread.sleep(1000); 
		      
		      driver.close();
		      driver.quit();
	}

}
