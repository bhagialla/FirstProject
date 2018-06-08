package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Library2 {

	WebDriver driver;

@Given("^Open Browser$")
public void open_Browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@When("^access application$")
public void access_application() throws Throwable {
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
}

@Then("^enter username and password and click on Login button$")
public void enter_username_and_password_and_click_on_Login_button() throws Throwable {
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
}

@Then("^Click on Logout link$")
public void click_on_Logout_link() throws Throwable {
	driver.findElement(By.linkText("Logout")).click();
}

@Then("^Close the browser$")
public void close_the_browser() throws Throwable {
	driver.quit();

}


}
