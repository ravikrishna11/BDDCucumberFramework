//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginStepDefinition {
//	
//	
//	WebDriver driver;
//	
//	
//	
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//        System.setProperty("webdriver.chrome.driver", "C://Users//Ravi//Downloads//driverchrome//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//	    
//	}
//
//	@When("^title of the login page is Free CRM$")
//	public void title_of_the_login_page_is_Free_CRM() {
//		
//		String title = driver.getTitle();
//		System.out.println("Login Page Title: "+title);
//		
//		Assert.assertEquals("Cogmento CRM", title);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	  
//	
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password) {
//	   
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on the login button$")
//	public void user_clicks_on_the_login_button() {
//	    
//		driver.findElement(By.xpath("//div[text() ='Login']")).click();
//	}
//	@Then("^user is on the home page$")
//	public void user_is_on_the_home_page(){
//		
//		String title = driver.getTitle();
//		System.out.println("Home Page Title: "+title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}	
//		@Then("^user moves to new contact page$")
//		public void user_moves_to_new_contact_page() {
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//span[text()='Contacts']")).click();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
//		
//			
//		}
//
//		@Then("^user fill contact details \"([^\"]*)\" and \"([^\"]*)\"$")
//		public void user_enters_contact_details(String firstname, String lastname) {
//			
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		}
//	    @Then("^Close the browser$")
//	    public void close_the_browser()  {
//	    driver.quit();
//	    }
//	    
//	
//
//
//	
//	
//	
//		
//	
//
//}
