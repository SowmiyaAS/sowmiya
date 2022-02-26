package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
	     driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Divya");
	
	//click find leads
	driver.findElement(By.id("ext-gen334")).click();
	Thread.sleep(1000);
          //click lead id
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	//get title
	String title = driver.getTitle();
	//String title1 ="View Lead | opentaps CRM";
	System.out.println(title);
	//click edit button
	driver.findElement(By.linkText("Edit")).click();
	//edit company name
	WebElement name = driver.findElement(By.id("updateLeadForm_companyName"));
     name.click();
     name.clear();
	name.sendKeys("ANSS");
	//click create lead
	driver.findElement(By.className("smallSubmit")).click();
	//get text
	String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	System.out.println(text);
	String text2 ="ANSS (11329)";
			if(text2.equals(text))
			{		
		System.out.println("Correct");
	}
			else 
	{
		System.out.println("Wrong");
	}
	
	}
	}

