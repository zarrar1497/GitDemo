import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* SECTION 2 -COMPLETE INSTALLATION GUIDE FOR JAVA */
		
		/* SECTION 3 -BRUSH UP JAVA CONCEPTS FOR SELENIUM */
		
		/* SECTION 4 -CORE JAVA IN DEPTH */
		
		/* SECTION 5 -CONFIGURING SELENIUM & RUNNING  */
		
		System.setProperty("webdriver.chrome.driver","X:\\Automation\\\\chromedriver_win32\\chromedriver.exe");
		//this is gitdemo test
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } 
        
        else {
            System.out.println("Test Failed");
        }		

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
		
	}

}
