package com.stepdefiniton;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_stepdefinition {
	
	public static WebDriver driver;
	static Properties prop=new Properties();
	
	@Given("User in on the home page")
	public void user_in_on_the_home_page() throws IOException, InterruptedException {
		
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse WorkSpace\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("user enter username")
	public void user_enter_username() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		driver.findElement(By.id(prop.getProperty("signin_button_id"))).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_id"))); 
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("8755918349");
		driver.findElement(By.id(prop.getProperty("continue_id"))).click();
		
		
	}

	@And("user enters password")
	public void user_enters_password() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys("nahipata.1");
		
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		driver.findElement(By.id(prop.getProperty("sign_in_id"))).click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon Sign In";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.close();
	}
	
	
	@When("user enter wrong username")
	public void user_enter_wrong_username() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		driver.findElement(By.id(prop.getProperty("signin_button_id"))).click();
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("0000000000");
		driver.findElement(By.id(prop.getProperty("continue_id"))).click();
	}

	@Then("user is shown a error message")
	public void user_is_shown_a_error_message() throws IOException {
		
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		
		String t = "Incorrect phone number";
	      // identify elements with text()
	      List<WebElement> l= driver.findElements(By.xpath(prop.getProperty("error_signin_xpath")));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Text: " + t + " is present. ");
	      } else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
	      driver.close();
	}
	
	//////  SEARCH PAGE     //////////////
	
	
	@When("user click on search bar")
	public void user_click_on_search_bar() throws IOException {
		
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		driver.findElement(By.id(prop.getProperty("seach_bar_id"))).click();
	}

	@And("user give some product name")
	public void user_give_some_product_name() {
		driver.findElement(By.id(prop.getProperty("seach_bar_id"))).sendKeys("smartwatch");
		driver.findElement(By.xpath(prop.getProperty("search_button_xpath"))).click();
		
	}

	@Then("results will come up on the screen")
	public void results_will_come_up_on_the_screen() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		
		String t = "1-16 of over 50,000 results for \"smartwatch\"";
	      // identify elements with text()
	      List<WebElement> l= driver.findElements(By.xpath(prop.getProperty("result_match_xpath")));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Text: " + t + " is present. ");
	      } else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
	      driver.close();
	}

	@When("user enter wrong product name")
	public void user_enter_wrong_product_name() {
		driver.findElement(By.id(prop.getProperty("seach_bar_id"))).click();
		driver.findElement(By.id(prop.getProperty("seach_bar_id"))).sendKeys("error123");
		driver.findElement(By.xpath(prop.getProperty("search_button_xpath"))).click();
		
	}

	@Then("user should get error message")
	public void user_should_get_error_message() throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Eclipse WorkSpace\\Automation_Amazon\\PageFactory.properties");
		prop.load(ip);
		
		String t = "No results for error123."	;
	      // identify elements with text()
	      List<WebElement> l= driver.findElements(By.xpath(prop.getProperty("error_product_xpath")));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Text: " + t + " is present. ");
	      } else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
	      driver.close();
	}
	
	
	
	//// ADD TO CART ////
	
	
	
	@Then("user choose the product and add to the cart")
	public void user_choose_the_product_and_add_to_the_cart() {
		driver.findElement(By.xpath(prop.getProperty("brand_xpath"))).click();
		driver.navigate().to(prop.getProperty("product_link"));
		driver.findElement(By.xpath(prop.getProperty("add_to_cart_button_xpath"))).click();
		driver.close();
	}
	
	
	
	@Then("user choose the product and click buy now for direct purchasing")
	public void user_choose_the_product_and_click_buy_now_for_direct_purchasing() {
		driver.findElement(By.xpath(prop.getProperty("brand_xpath"))).click();
		driver.navigate().to(prop.getProperty("product_link"));
		driver.findElement(By.xpath(prop.getProperty("but_now_xpath"))).click();
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("8755918349");
		driver.findElement(By.id(prop.getProperty("continue_id"))).click();
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys("nahipata.1");
		driver.findElement(By.id(prop.getProperty("sign_in_id"))).click();
		
		driver.close();
	}
	
	// PURCHASING  ////
	
	
	@And("user add item in cart")
	public void user_add_item_in_cart() {
		driver.findElement(By.xpath(prop.getProperty("brand_xpath"))).click();
		driver.navigate().to(prop.getProperty("product_link"));
		driver.findElement(By.xpath(prop.getProperty("add_to_cart_button_xpath"))).click();

		
	}

	@Then("user visit the cart and view or change product quantity for purchasing")
	public void user_visit_the_cart_and_view_or_change_product_quantity_for_purchasing() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cart_xpath")))); 
		driver.findElement(By.xpath(prop.getProperty("cart_xpath"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("quantity_xpath")))); 
		WebElement quantity_dropdown = driver.findElement(By.xpath(prop.getProperty("quantity_xpath")));
		quantity_dropdown.click();
		WebElement option = driver.findElement(By.xpath(prop.getProperty("option")));
		option.click();
		driver.close();
	}
	
	
	
	@And("user add product")
	public void user_add_product() {
		driver.findElement(By.xpath(prop.getProperty("brand_xpath"))).click();
		driver.navigate().to(prop.getProperty("product_link"));
		driver.findElement(By.xpath(prop.getProperty("add_to_cart_button_xpath"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cart_xpath")))); 
		driver.findElement(By.xpath(prop.getProperty("cart_xpath"))).click();
	}

	@Then("user is able to do checkout")
	public void user_is_able_to_do_checkout() {
		driver.findElement(By.xpath(prop.getProperty("proceed_to_buy_xpath"))).click();
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("8755918349");
		driver.findElement(By.id(prop.getProperty("continue_id"))).click();
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys("nahipata.1");
		driver.findElement(By.id(prop.getProperty("sign_in_id"))).click();
		driver.findElement(By.xpath(prop.getProperty("address_xpath"))).click();
		driver.close();
		
	}
	
	// LOGOUT ////
	
	@Then("user logged in successfully and user should able to logout from website")
	public void user_logged_in_successfully_and_user_should_able_to_logout_from_website() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon Sign In";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		WebElement  opt= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(opt).perform();
		
		WebElement  signout= driver.findElement(By.xpath(prop.getProperty("signout_button_xpath")));
		action.click(signout).perform();
		driver.close();
	}

}