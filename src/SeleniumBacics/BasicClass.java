package SeleniumBacics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {

	public static void main(String[] args) {
//local machine2 
		System.out.println("local machine2");
//local machine3
		System.out.println("local machine3");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
