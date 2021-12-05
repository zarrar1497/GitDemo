package Section_11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class section_11_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WINDOW NAVIGATION INTERACTIONS
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator(); //iterate karne k liyeh
		String parentid=it.next();
		String childid=it.next();
		
		//parent to child
		driver.switchTo().window(childid);
		System.out.println("AFTER SWITCHING");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		

		//child to parent
		driver.switchTo().window(parentid);
		System.out.println("SWITCHING PARENTID");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
