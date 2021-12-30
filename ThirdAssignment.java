package SeleniumBasics;



import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
		////////////working with iframes
			
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
	     Thread.sleep(4000);
	     WebElement iframe= driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
 	    driver.switchTo().frame(iframe);
          Thread.sleep(4000);

          
		   ////////////  working with pop up window

			driver.get("https://www.w3schools.com/");
			Thread.sleep(700);
			String pHandle= driver.getWindowHandle();
			System.out.println(pHandle);
			driver.findElement(By.xpath("//span[contains(text(),'own')]").click();
			Thread.sleep(500);
			Set<String> handles =driver.getWindowHandles();
			System.out.println(handles);
			
			
			for(String h:handles)  
			{
				System.out.println("The Value of current handle is ---" +h);
				driver.switchTo().window(h);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
			}

		
		    

driver.close();
driver.quit();

	}

}
