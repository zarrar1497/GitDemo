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

public class section_8_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HANDLING CALENDER UI
		
		//NOT WORKING
		
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		int count =driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("31"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
}

}
