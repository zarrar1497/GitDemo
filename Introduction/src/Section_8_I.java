import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_8_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* SECTION 8 -SELENIUM INTRODUCTION */
		/* HANDLING ALERTS */
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("HELLO");

		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("CONFIRM");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
