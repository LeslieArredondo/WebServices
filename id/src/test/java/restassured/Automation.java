package restassured;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Books.BookRestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public String baseUrl = "https://simple-books-api.glitch.me/";
	String driverPath = "src/test/resources/drivers/chromedriver";
	public WebDriver driver;

	@BeforeTest
	private void startTesting() {
		System.out.println("This is a Before Test");
	}

	@Test
	public void welcome() {

		Assert.assertEquals(driver.getCurrentUrl(),
				"{\n" + "    \"bookId\": 3,\n" + "    \"customerName\": \"MijaelN\"\n" + "}");
	}

	

}