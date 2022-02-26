package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sharath@gmail.com");
		//find lead
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(500);
		//click lead id and find duplicate
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text1 = lead.getText();
		System.out.println(text1);
		lead.click();
		
		//click duplicate lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//get page title
		String title = driver.getTitle();
      System.out.println(title);
      //click create lead
		driver.findElement(By.className("smallSubmit")).click();
		//get company name
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		
		
	 	}
	

}
