package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TaggedHooks_StepDefinition {
	
	
	
	@Before(order=0)
	public void setUp() {
		System.out.println("Launch the Browser");
		System.out.println("Enter the Free Crm URL");
	}
	@After(order=0)
	public void tearDown() {
		System.out.println("close the Browser");
	}
	@Before(order=1)
	public void setUp11() {
		System.out.println("Launch the Browser");
		System.out.println("Enter the Free Crm URL");
	}
	@After(order=1)
	public void tearDown1() {
		System.out.println("close the Browser");
	}
	@Before("@First")
	public void beforeFirst() {
		
		System.out.println("before only first scenario");
	}
	@After("@First")
	public void afterFirst() {
		
		System.out.println("after only first scenario");
	}
	@Before("@Second")
	public void beforeSecond() {
		
		System.out.println("before only second scenario");
	}
	@After("@Second")
	public void afterSecond() {
		
		System.out.println("after only second scenario");
	}
	@Before("@Thrid")
	public void beforeThrid() {
		
		System.out.println("before only thrid scenario");
	}
	@After("@Thrid")
	public void afterThrid() {
		
		System.out.println("after only thrid scenario");
	}
	@Given("^this is the first step$")
	public void this_is_the_first_step() {
		
		System.out.println("1st step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() {
		System.out.println("2nd step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() {
		System.out.println("3rd step");

}
}
