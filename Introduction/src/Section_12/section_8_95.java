package Section_12;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_8_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HANDLING CALENDER UI
		
		//GRAB COMMON ATTRIBUTE AND PUT IT INTO LIST
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		
		while(!driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
		}
		
		
		List<WebElement> dates=driver.findElements(By.className("ui-state-default"));
		
		int count =driver.findElements(By.className("ui-state-default")).size();
		for(int i=0;i<count;i++)
		{
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase("31"))
			{
				dates.get(i).click();
				break;
			}
			
		}
}

}
