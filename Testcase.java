package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com//opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
	   String title=driver.getTitle();
	   System.out.println(title);
	   
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   
	   driver.findElement(By.linkText("Create Lead")).click();
	   
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sowmiya");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sowmi");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("engineer");
	        
	     
	     driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("97654");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AS");
	  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("as");
	  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testleaf");
	  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("208900");
	  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5425");
	  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
	  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("si");
	  driver.findElement(By.id("createLeadForm_description")).sendKeys("testleaf is a software testing comoany");
	  
	  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/08/98");
	  
	  WebElement dropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select source=new Select(dropdown1);
	    source.selectByVisibleText("Employee"); 
	     
	    WebElement dropdown2=driver.findElement(By.id("createLeadForm_industryEnumId"));
	     Select industry=new Select(dropdown2);
	     industry.selectByIndex(2);
	      
	     WebElement dropdown3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     Select ownership=new Select(dropdown3);
	     ownership.selectByValue("OWN_SCORP");
	     
	     WebElement dropdown4=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	     Select Marketing=new Select(dropdown4);
	     Marketing.selectByVisibleText("Automobile"); 

	     driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
	     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
	     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("hello");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sowmiya@gmail.com");
	     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("88998753");
	     driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sowmiya");
	     driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.web");
	     
	     driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sowmiya");
	     driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("trichy");
	     driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("thanjavur");;
	     driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("5678");
	     driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12");
	     driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sowmi");
	     driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("andakottai");
	     WebElement dropDown5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	 	Select currency=new Select(dropDown5);
	 	currency.selectByValue("INR");
	     
	     
	     WebElement dropdown6=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	     Select country=new Select(dropdown6);
	    country.selectByValue("IND");
	    
	    WebElement dropdown7=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select state=new Select(dropdown7);
	   state.selectByValue("IN-TN");
	    
	 driver.findElement(By.className("smallSubmit")).click();
	    
	     String title1 =driver.getTitle();
	      String title2="Create Lead | opentaps CRM";
	      if(title1.equals(title2))
	      {
	    	  System.out.println("Testcase pass");
	      }
	      else
	      {
	    	  System.out.println("Testcase fail");
	    	 }

	      }
	}


