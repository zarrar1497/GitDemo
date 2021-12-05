package Section_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class section_11_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MOUSE INTERACTIONS
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		//action class ka object banana padega
		Actions a=new Actions(driver);
		
		//Mouse hover
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//uppercase
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform();
		
		//right click
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		

		
		
	}

}
