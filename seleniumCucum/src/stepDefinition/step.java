package stepDefinition;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	
	static WebDriver driver;
	@Given("^Open chrome and start guru(\\d+) application$")
	public void open_chrome_and_start_guru_application(int arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver","E:\\selenium\\do                                                                           c\\seleniumCucum\\driv\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/V4/index.php");
	    
	}

	@When("^I provide valid username and password$")
	public void i_provide_valid_username_and_password() throws Throwable {
	   driver.findElement(By.name("uid")).sendKeys("mngr162406");
	   driver.findElement(By.name("password")).sendKeys("mEdEram");
	}

	@Then("^User should be open manager home page$")
	public void user_should_be_open_manager_home_page() throws Throwable {
		 driver.findElement(By.name("btnLogin")).click();
	   
	}
  
	
	// To Add New Customer 
	
	@Given("^User should be add new customer$")
	public void user_should_be_add_new_customer() throws Throwable {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    
		
	}

	@When("^I provide valid information for add customer$")
	public void i_provide_valid_information_for_add_customer() throws Throwable {
		driver.findElement(By.name("name")).sendKeys("Sai Reithivik");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.name("dob")).sendKeys("01-04-2016");
		driver.findElement(By.name("addr")).sendKeys("no35 \nBajanai Koil St\n Nandambakkam");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("pinno")).sendKeys("600089");
		driver.findElement(By.name("telephoneno")).sendKeys("8903586701");
		driver.findElement(By.name("emailid")).sendKeys("krishjo86@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sai@123456");
		
	}

	@Then("^User Should be click submit button$")
	public void user_Should_be_click_submit_button() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	}




}
