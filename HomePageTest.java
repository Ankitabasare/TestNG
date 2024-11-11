
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import java.util.List;

	public class HomePageTest {
	    WebDriver driver;
	    String baseUrl = "http://practice.automationtesting.in/";

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the chromedriver executable
	      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void testHomePageWithThreeArrivals() {
	        // Step 1: Open the browser and navigate to the URL
	        driver.get(baseUrl);

	        // Step 2: Click on Shop Menu
	        WebElement shopMenu = driver.findElement(By.linkText("Shop"));
	        shopMenu.click();

	        // Step 3: Click on Home Menu button
	        WebElement homeMenu = driver.findElement(By.linkText("Home"));
	        homeMenu.click();

	        // Step 4: Verify the Home page has only three arrivals
	        List<WebElement> arrivals = driver.findElements(By.cssSelector(".products .product"));
	        int numberOfArrivals = arrivals.size();

	        // Assertion to verify there are exactly three arrivals
	        Assert.assertEquals(numberOfArrivals, 3, "The Home page does not contain exactly three arrivals.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

