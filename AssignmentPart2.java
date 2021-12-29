package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		  
	    driver.findElement(By.xpath("//strong[contains(text(),'Feedback')]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Vaibhav");
	    Thread.sleep(2000);
	    
	
	    driver.findElement(By.cssSelector("input#email[name='email']")).sendKeys("vaibh@gmial.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("#subject")).sendKeys("N/A");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("textarea.span6#comment[type='text']")).sendKeys("There are no suggestions");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    Thread.sleep(2000);
	      driver.close();
	      driver.quit();
	}

}
