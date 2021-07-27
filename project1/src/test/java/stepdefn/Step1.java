package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 
{
	WebDriver driver=null;
	
	@Given("Open chrome and url of the application")
	public void open_chrome_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://affiliate.flipkart.com/login");	
}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("inputEmail")).sendKeys("abhishetty017@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Jumadi@1234");
		driver.findElement(By.id("submitLogin")).click();
		
	}
	
	@Then("Login to account")
	public void login_to_account() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login to the account");
	}
}
