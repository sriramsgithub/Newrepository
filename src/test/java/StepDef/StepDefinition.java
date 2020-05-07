package StepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition
{
    static WebDriver driver;
    public void screenshot(String s1)
    {
    	TakesScreenshot screen = ((TakesScreenshot)driver);
    	File file = screen.getScreenshotAs(OutputType.FILE);
    	File path = new File("C:\\Users\\sriramsn\\Desktop\\Screen\\"+s1+".jpg");
    	try {
			FileUtils.copyFile(file,path);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	@Given("^I have url$")
	public void url()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.rapidtestpro.com/login.php");
		screenshot("Launch");
}

@When("^I entered the username and password$")
public void i_entered_the_username_and_password() 
{
   driver.findElement(By.id("accno")).sendKeys("1234556666");
   driver.findElement(By.id("pass")).sendKeys("MavDemo@01");
   screenshot("Loginpage");
   driver.findElement(By.id("submitButton")).click();
 
}
@And("^I entered the pin$")
public void i_entered_the_pinnumber()
{
	driver.findElement(By.id("accpin")).sendKeys("12345");
	driver.findElement(By.id("submitButton")).click();
}

@Then("^I successfully logged in to the application$")
public void i_successfully_logged_in_to_the_application() throws Throwable
{
	/*
	 * String s1=driver.findElement(By.id("Welcome")).getText();
	 * System.out.println(s1);
	 * 
	 * String s2 = "Sign Out"; Assert.assertEquals(s2,s1);
	 */
	 
	screenshot("Home Page");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign Out")).click();
	driver.close();
	
}
	
	
}
