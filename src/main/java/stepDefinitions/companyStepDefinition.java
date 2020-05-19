//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class companyStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() {
//		
//        System.setProperty("webdriver.chrome.driver", "C://Users//Ravi//Downloads//driverchrome//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//	    
//	}
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
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
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
//
//	@Then("^user move to new company page$")
//	public void user_move_to_new_company_page() {
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[text()='Companies']")).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@href='/companies/new']")).click();
//		
//	}
//
//	@Then("^user filling company details cname and industry$")
//	public void user_filling_company_details_cname_and_industry(DataTable dataComp)  {
//		
//		List<List<String>> data1= dataComp.raw();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data1.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name='industry']")).sendKeys(data1.get(0).get(1));
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		
//	    
//	}
//	@Then("^Close the browser$")
//    public void close_the_browser()  {
//    driver.quit();
//    }
//
//
//	
//	
//}
