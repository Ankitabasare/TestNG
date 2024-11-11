import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set up the WebDriver and navigate to the URL
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void testLoginFunctionality() {
        // Locate username and password fields and login button, then perform login actions
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.cssSelector("button#submit")).click();

        // Create a SoftAssert instance
        SoftAssert softAssert = new SoftAssert();

        // Verify the URL after login
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        softAssert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as expected.");

        // Verify the success message after login
        WebElement successMessage = driver.findElement(By.tagName("strong"));
        System.out.println("success message"+successMessage);
        String expectedMessage = "Congratulations student. You successfully logged in!";
        String actualMessage = successMessage.getText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage), 
                "Actual message does not contain expected message.\nActual Message: " + actualMessage + "\nExpected Message: " + expectedMessage);

        // Verify that the "Log Out" button is visible
        WebElement logOutButton = driver.findElement(By.linkText("Log out"));
        softAssert.assertTrue(logOutButton.isDisplayed(), "Log Out button is not visible.");

        // Assert all to report any soft assertion failures
       // softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
      //  driver.quit();
    }
}
