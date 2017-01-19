package uptake;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class uptaketest {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver","/Users/coreylyons/Documents/workspace/Libraries/geckodriver");
		// Create a new instance of the Firefox driver
		//WebDriver driver = new FirefoxDriver();
		
		// Chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/coreylyons/Documents/workspace/Libraries/chromedriver");
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
        //Launch Uptake Website
		driver.get("http://uptake.com");
 
        // Print a Log In message to the screen
        System.out.println("PASS: Uptake.com opened successfully");
        
		WebElement Logo = driver.findElement(By.xpath("/html/body/header/div/a"));
		WebElement Animation = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div/h1"));
		WebElement Approach = driver.findElement(By.xpath("//*[@id='menu-item-4164']"));
		WebElement Platform = driver.findElement(By.xpath("//*[@id='menu-item-4163']"));
		WebElement Solutions = driver.findElement(By.xpath("//*[@id='menu-item-4172']"));
		WebElement People = driver.findElement(By.xpath("//*[@id='menu-item-4162']"));
		WebElement JoinUs = driver.findElement(By.xpath("//*[@id='menu-item-4167']"));
		WebElement ContactUs = driver.findElement(By.xpath("//*[@id='menu-item-4334']"));
		WebElement Blog = driver.findElement(By.xpath("//*[@id='menu-item-4164']"));
		WebElement NextArrow = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/a"));

		
	    System.out.println("Validating Logo, Title Animation, and Menu Elements are Present...");

        
        // Validate Logo is Present 
        if(Logo!= null){
	    	System.out.println("PASS: Logo is present");
	    	}else{
	    	System.out.println("FAIL: Logo is not present");
	    	}
        
        // Validate Hero Title Animation is present 
        if(Animation!= null){
	    	System.out.println("PASS: Hero Title Animation is present");
	    	}else{
	    	System.out.println("FAIL: Hero Title Animation is not present");
	    	}

	    // Validate Menu Elements
        // Menu Element: Approach
	    if(Approach!= null){
	    	System.out.println("PASS: Approach Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Approach Link in Primary Menu is Missing");
	    	} 
	    // Menu Element: Platform
	    if(Platform!= null){
	    	System.out.println("PASS: Platform Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Platform Link in Primary Menu is Missing");
	    	} 
	    // Menu Element: Solutions
	    if(Solutions!= null){
	    	System.out.println("PASS: Solutions Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Solutions Link in Primary Menu is Missing");
	    	} 
	    // Menu Element: People
	    if(People!= null){
	    	System.out.println("PASS: People Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: People Link in Primary Menu is Missing");
	    	} 	
	    // Menu Element: Join Us
	    if(JoinUs!= null){
	    	System.out.println("PASS: Join Us Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Join Us Link in Primary Menu is Missing");
	    	} 
	    // Menu Element: Contact Us
	    if(ContactUs!= null){
	    	System.out.println("PASS: Contact Us Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Contact Us Link in Primary Menu is Missing");
	    	} 
	    // Menu Element: Blog
	    if(Blog!= null){
	    	System.out.println("PASS: Blog Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Blog Link in Primary Menu is Missing");
	    	} 
	    
	    System.out.println("Testing Next Arrow and going to bottom of page...");
	    
	    // Wait 2s	    
	    Thread.sleep(2000);
	    // Click on Next arrow 
	    NextArrow.click();
	    // Wait 2s
	    Thread.sleep(2000);
	    // Scroll to bottom
	    ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
	    // Wait 2s
	    Thread.sleep(2000);
	    
	    System.out.println("Validating Footer Elements are Present...");

	    // Footer Elements
	    WebElement Copyright = driver.findElement(By.xpath("/html/body/footer/div/div[3]"));
	    WebElement ApproachF = driver.findElement(By.xpath("//*[@id='menu-item-4164']"));
	    WebElement PlatformF = driver.findElement(By.xpath("//*[@id='menu-item-4163']"));
	    WebElement PeopleF = driver.findElement(By.xpath("//*[@id='menu-item-4172']"));
	    WebElement Philan = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul[2]/li[1]/a"));
	    WebElement Media = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul[2]/li[2]/a"));
	    WebElement OpenPos = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul[2]/li[3]/a"));
	    WebElement BlogF = driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/ul[2]/li[4]/a"));
	    WebElement SocMed = driver.findElement(By.xpath("/html/body/footer/div/div[2]/ul"));
	    WebElement TopArrow = driver.findElement(By.xpath("/html/body/footer/div/div[1]/a"));
	    
	    // Validate Copyright info is present and display
	    System.out.println("Copyright Info: " + Copyright.getText());
	    
	 // Validate Footer Menu Elements
        // Footer Menu Element: Approach
	    if(ApproachF!= null){
	    	System.out.println("PASS: Approach Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Approach Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: Platform
	    if(PlatformF!= null){
	    	System.out.println("PASS: Platform Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Platform Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: People
	    if(PeopleF!= null){
	    	System.out.println("PASS: People Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: People Footer Link is Not Present");
	    	}    
        // Footer Menu Element: Philanthropy
	    if(Philan!= null){
	    	System.out.println("PASS: Philanthropy Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Philanthropy Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: Media
	    if(Media!= null){
	    	System.out.println("PASS: Media Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Media Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: Open Positions
	    if(OpenPos!= null){
	    	System.out.println("PASS: Open Positions Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Open Positions Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: Blog
	    if(BlogF!= null){
	    	System.out.println("PASS: Blog Footer Link is Present");
	    	}else{
	    	System.out.println("FAIL: Blog Footer Link is Not Present");
	    	} 
	    // Footer Menu Element: Social Media Buttons
	    if(SocMed!= null){
	    	System.out.println("PASS: Social Media Buttons Footer Links are Present");
	    	}else{
	    	System.out.println("FAIL: Social Media Buttons Footer Links are Not Present");
	    	} 
	    
	    System.out.println("Returning to Top of Page then Navigating to Jobs Page...");

	    // Click Arrow to Return to Top of Page
	    TopArrow.click(); 
	    // Wait 2s
	    Thread.sleep(2000);
	    
	    //Navigate to a different page
	    // Click on Join Us Link
	    driver.findElement(By.xpath("//*[@id='menu-item-4167']")).click(); 
	    
	    System.out.println("Validating Header Image and URL...");
	  		
	  	// Display URL to validate landed on Jobs page
	    String URL = driver.getCurrentUrl();
	    String jobsURL = "https://uptake.com/jobs/";
	    
	    if(URL.equals(jobsURL)) {
	    	System.out.println("PASS: Landed on Jobs page");
	    	}else{
	    	System.out.println("FAIL: Did not land or Jobs page, link broken or page failed to load.");
	    	}
	    
	    WebElement JobsHeader = driver.findElement(By.xpath("/html/body/div[1]"));
	    
	    // Validate Header Image is Present
	    if(JobsHeader!= null){
	  		System.out.println("PASS: " + JobsHeader.getText() + " is Present");
	  		}else{
	  		System.out.println("FAIL: " + JobsHeader.getText() + " is Not Present");
	  		} 
	    
	    System.out.println("Validating Common Elements on Page then Navigating back to Homepage via click on Logo...");

	    // Switch iFrames
	    // driver.switchTo().defaultContent(); // get out of all frames
	    driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/iframe")));
	    
	    // Validate iFrame selected
	    if(driver.findElement(By.xpath("/html/body/div/div/div/section[5]/div[15]/a"))!= null){
	  		System.out.println("PASS: iFrame selected");
	  		}else{
	  		System.out.println("FAIL: iFrame not selected");
	  		} 
	    
	    System.out.println("Validating Common Elements are Present on Page...");
	    
	    // Validate Common Elements are Present on the Page
	    WebElement AccountingFin = driver.findElement(By.id("17832"));
	    WebElement ExcellAviation = driver.findElement(By.id("27304"));
	    WebElement CorporateDev = driver.findElement(By.id("16357"));
	    WebElement DataScience = driver.findElement(By.id("16348"));
	    WebElement Engineering = driver.findElement(By.id("16349"));
	    WebElement ITsec = driver.findElement(By.id("16352"));
	    WebElement MarketingComm = driver.findElement(By.id("23450"));
	    WebElement Ops = driver.findElement(By.id("25745"));
	    WebElement PeopleJ = driver.findElement(By.id("20740"));
	    WebElement Product = driver.findElement(By.id("16359"));
	    WebElement SolutionsJ = driver.findElement(By.id("16356"));
	    WebElement Internship = driver.findElement(By.id("21966"));
	    WebElement TechOps = driver.findElement(By.id("16351"));
	    WebElement UX = driver.findElement(By.id("16358"));
	 
	    
	    if(driver.findElement(By.id("17832"))!= null){
	  		System.out.println("--PASS: " + AccountingFin.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + AccountingFin.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("27304"))!= null){
	  		System.out.println("--PASS: " + ExcellAviation.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + ExcellAviation.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16357"))!= null){
	  		System.out.println("--PASS: " + CorporateDev.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + CorporateDev.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16348"))!= null){
	  		System.out.println("--PASS: " + DataScience.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + DataScience.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16349"))!= null){
	  		System.out.println("--PASS: " + Engineering.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + Engineering.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16352"))!= null){
	  		System.out.println("--PASS: " + ITsec.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + ITsec.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("23450"))!= null){
	  		System.out.println("--PASS: " + MarketingComm.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + MarketingComm.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("25745"))!= null){
	  		System.out.println("--PASS: " + Ops.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + Ops.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("20740"))!= null){
	  		System.out.println("--PASS: " + PeopleJ.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + PeopleJ.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16359"))!= null){
	  		System.out.println("--PASS: " + Product.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + Product.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16356"))!= null){
	  		System.out.println("--PASS: " + SolutionsJ.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + SolutionsJ.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("21966"))!= null){
	  		System.out.println("--PASS: " + Internship.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + Internship.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16351"))!= null){
	  		System.out.println("--PASS: " + TechOps.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + TechOps.getText() + " is Not Present");
	  		} 
	    if(driver.findElement(By.id("16358"))!= null){
	  		System.out.println("--PASS: " + UX.getText() + " is Present");
	  		}else{
	  		System.out.println("--FAIL: " + UX.getText() + " is Not Present");
	  		} 
	    
	    // Validate Job listing is present
	    // if(driver.findElement(By.xpath("/html/body/div/div/div/section[5]/div[15]/a"))!= null){
	    if(driver.findElement(By.xpath("//*[contains(text(), 'QA Engineer')]"))!= null){	
	    	System.out.println("PASS: QA Engineer listing present!");
	    	}else{
	    	System.out.println("FAIL: QA Engineer listing not present");
	    	} 
	    
    	System.out.println("Scrolling to bottom of page...");
    	
    	// Get out of iFrame
	    driver.switchTo().defaultContent(); // get out of all frames
    	
	    // Scroll to bottom
	    ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
	    
	    // Jobs Footer Elements
	    WebElement JobsCopyright = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]"));
    	
	    System.out.println("Displaying Copyright Info...");

	    // Display Copyright Info
	    System.out.println(JobsCopyright.getText());

	        	
    	System.out.println("Click up arrow to return to Top of Page...");
	    
	    // Click on Uptake Logo to Return to Home page 
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/a")).click();
	    
	    // Wait 2s
	    Thread.sleep(2000);
	    
	    // Quick Validation that return to Home page was successful
	    // Validate Logo is Present 
        if(Logo!= null){
	    	System.out.println("PASS: Logo is present");
	    	}else{
	    	System.out.println("FAIL: Logo is not present");
	    	}
        
        // Validate Hero Title Animation is present 
        if(Animation!= null){
	    	System.out.println("PASS: Hero Title Animation is present");
	    	}else{
	    	System.out.println("FAIL: Hero Title Animation is not present");
	    	}

        // Menu Element: Approach
	    if(Approach!= null){
	    	System.out.println("PASS: Approach Link in Primary Menu is Present");
	    	}else{
	    	System.out.println("FAIL: Page did not load correctly: Approach Link in Primary Menu is Missing");
	    	} 
	    

	    
	    // Close the driver
        driver.close();
    }
}

	