package Section_13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_13_99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//Perform scrolling with in table and Windows level
		
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//go to chrome and if you want to scroll then use this in console-->window.scrollBy(0,500)
		
		js.executeScript("window.scrollBy(0,500)");
		
		//agr webpage me koi vertical table ko scroll krna ho to -->document.querySelector(".tableFixHead").scrollTop=5000
		//agr webpage me koi horizontal table ko scroll krna ho to -->document.querySelector(".tableFixHead").scrollLeft=5000
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000"); // scroll krne k liyeh
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); // last column ka values store krne k liyeh
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
			//System.out.println(sum); to check the for loop
			
		}
		System.out.println(sum);
	}

}
