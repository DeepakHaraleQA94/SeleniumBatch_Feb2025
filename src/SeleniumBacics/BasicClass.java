package SeleniumBacics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement getLoginText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='JALA Academy']")));
	    System.out.println(getLoginText.getText());
	    
	    
	    
	    WebElement radiobutton = driver.findElement(By.xpath("//input[@name='rdbGender' and @value='M']"));
	    Thread.sleep(2000);
	    if (!radiobutton.isSelected()) {
	 	   radiobutton.click(); 
	    }

	    if (radiobutton.isSelected()) {
	        System.out.println("Male radio button is selected.");
	    } else {
	        System.out.println("Male radio button is not selected.");
	    }
	}

}
