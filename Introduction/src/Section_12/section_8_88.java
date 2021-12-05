package Section_12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_8_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LIMITING WEBDRIVER SCOPE

		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//give me the count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limit the webdriver scope -footer		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//limit the webdriver scope -footer 1st column
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column & check if pages are opening 
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) 
		{
			String clickonlink=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);	
			
		}	
		
		Set<String> abc=driver.getWindowHandles(); //total count will be 4
		
		Iterator<String>it =abc.iterator();
		
		while(it.hasNext())//check if it has next tab or not
			{
			
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
					
					
					
		
		
		
		
		
		
		
		
		
	}

}
