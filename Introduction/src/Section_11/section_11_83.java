package Section_11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class section_11_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WINDOW NAVIGATION INTERACTIONS
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		//pehla iframe pe switch hona padta hai fir he drag and drop hoga
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		//drag and drop
		a.dragAndDrop(source, target).build().perform();
		
		
		
		
		
		
		
			
	}

}
