package Section_15;

import java.util.List;
import java.util.stream.Collectors;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class section_15_112 {
//AUTOMATING PAGINATION
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver",
				"X:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//WEB TABLE SORTING

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements into list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//capture text of all webelements into new [original] list
		List<String> original=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3->sorted list
		List<String> sortedlist=original.stream().sorted().collect(Collectors.toList());
		
		
		//compare original list vs sorted list
		Assert.assertTrue(original.equals(sortedlist));
		List<String> price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		//scan the column name with getText -> Beans-> print the price of the rice
		price=rows.stream().filter(s -> s.getText().contains("Rice"))
		.map(s ->getPriceVeggie(s)).collect(Collectors.toList());
	
				
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
		
		while(price.size()<1);
		
		
	
		}

	public static String getPriceVeggie(WebElement s)
	{
		
		String priceValue=s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		
		return priceValue;
		
	}
}
