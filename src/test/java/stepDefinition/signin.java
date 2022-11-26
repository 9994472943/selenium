package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class signin {
	
	public RemoteWebDriver driver;
	
	@Given ("Launch the url and Navigate to login Page")
	  public void MouseOverActionDemo() throws InterruptedException
	  {
		  WebDriverManager.chromedriver().setup();
		  RemoteWebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		  WebElement userSelect=driver.findElement(By.id("userSelect"));
	  }
		  @Then("Enter valid username") 
		  public void username()
		  {
		  driver.findElement(By.id("userSelect")).click();
		  }
		  
	@And("Enter the deposit button")
	public void deposit()
	{
	driver.findElement(By.xpath("//option[text()='Harry Potter']")).click();
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
@And("Enter the deposit amount")
public void  amount()
{
	driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("3200");
}
@And("click the deposit button")
public void depositbutton()
{
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("click logout button")
public void logout()
{
	driver.findElement(By.xpath("//button[@class='btn logout']")).click();
	}
	}


