

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import java.util.logging.Level;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SearchTest {
    
   

    WebDriver driver = null;

    @Given("^I am on the ya home page$")

    public void goToYA() {
        driver = new ChromeDriver();
        driver.navigate().to("http://yaengage.com/");
//		Refresh avoids pop-ups if necessary
//		driver.get("http://yaengage.com/");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void enterTerm(String link) {

        if (link.equalsIgnoreCase("Our Work")) {

            driver.findElement(By.xpath("//li[@id='menu-item-39']")).click();
            
        } else if (link.equalsIgnoreCase("Contact")) {

            driver.findElement(By.xpath("//li[@id='menu-item-40']")).click();
            
        } else if (link.equalsIgnoreCase("Careers")) {

            driver.findElement(By.xpath("//li[@id='menu-item-41']")).click();
            
        } else if (link.equalsIgnoreCase("Client Login")) {

            driver.findElement(By.xpath("//li[@id='menu-item-43']")).click();
            
        }
    }

    @Then("^the browser should display \"([^\"]*)\"$")

    public void checkPage(String result) {
        
        String target = " ";
        
        if (result.equalsIgnoreCase("We create and execute")) {

            target = driver.findElement(By.xpath("//div[@class='internalheader container']")).getText();
            
            assertTrue(target.contains(result));
            
        } else if (result.equalsIgnoreCase("Let’s connect")) {

            target = driver.findElement(By.xpath("//div[@class='internalheader container']")).getText();
            
            assertTrue(target.contains(result));
            
        } else if (result.equalsIgnoreCase("Ready to make a difference")) {

            target = driver.findElement(By.xpath("//div[@class='internalheader adj container']")).getText();
            
            assertTrue(target.contains(result));
            
        } else if (result.equalsIgnoreCase("Promotion Toolbox")) {

            target = driver.findElement(By.xpath("//div[@class='logincontentContainer']")).getText();
            
            assertTrue(target.contains(result));
            
        }
        
        
        
        
        
        
        

//        WebElement result = driver.findElement(By.xpath("//h1[@class='type-page-label-alt result-for']"));
//
//        assertEquals(result.getText().replaceAll("^\"|\"$", ""), arg1);
//        driver.close();

    }

}
