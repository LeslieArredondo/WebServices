package Books;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BookRestAssured {

	private static String URL = "https://simple-books-api.glitch.me/";

		@BeforeTest()
		public void setup() {
			RestAssured.baseURI = URL;
		}
		
		//GET WELCOME
		@Test(enabled=false)
		public void getWelcome() {
					
		given().log().all()			
		.when().get()
		.then().log().all().assertThat().statusCode(200);		
		
		}
		
		//GET BOOKS OFFERED
		@Test(enabled=false)
		public void getBooksOffered() {
			
			given().log().all()			
			.when().get("books")
			.then().log().all().assertThat().statusCode(200);		
		
		}
		
		//GET AVAILABLE BOOKS
		@Test(enabled=false)
		public void getAvailableBooks() {
			
			given().log().all()			
			.when().get("books?available=true")
			.then().log().all().assertThat().statusCode(200);		
		}
		
		//GET TYPE FICTION
		@Test(enabled=false)
		public void getTypeFiction() {
			
			given().log().all()			
			.when().get("books?type=fiction")
			.then().log().all().assertThat().statusCode(200);		
		}
		
		//GET NON-FICTION
		@Test(enabled=false)
		public void getTypeNonFiction() {
			
			given().log().all()			
			.when().get("books?type=non-fiction")
			.then().log().all().assertThat().statusCode(200);		
		}
		
		//GET SINGLE BOOKS
		@Test(enabled=false)
		public void getSingleBooks() {
			
			given().log().all()			
			.when().get("books/3")
			.then().log().all().assertThat().statusCode(200);				
		}
		
		//GET LIMIT 5 BOOKS
		@Test(enabled=false)
		public void get5Books () {
			
			given().log().all()			
			.when().get("books?limit=5")
			.then().log().all().assertThat().statusCode(200);	
		}
		
		//POST REGISTER CLIENT
		@Test(enabled=false)
		public void getRegisterApiClient() {
	
			given().header("Content-Type", "application/json").body("{\n"
					+ "    \"clientName\": \"LeslieR\",\n"
					+ "    \"clientEmail\": \"leslie5690489787@email.com\"\n"
					+ "}")				
			.when().post("api-clients")

			.then().log().all().assertThat().statusCode(201);
		}

		//POST AUTHORIZATION ORDERS
		@Test(enabled=false)
		public void getAuthorizationCreateOrders() {
					
			given().auth().oauth2("cbf5c7dd8c37e68ba9110d35e49186f23f987a0c689f9c1993614c4c71cdfbfd")
			.header("Content-Type", "application/json").body("{\n"
					+ "    \"bookId\": 3,\n"
					+ "    \"customerName\": \"MijaelN\"\n"
					+ "}")	
			.when().post("orders")
			.then().log().all().assertThat().statusCode(201);	
		}
		
		//PREVIOUS ORDERS
		@Test()
		public void getPreviousOrders () {
			
			given().log().all()			
			.when().get("orders")
			.then().log().all().assertThat().statusCode(201);

		
		}}	
		
	
