package br.com.testeQA;

import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TesteNomeDaRuaRest {
	@Before
	public void setUp() {
		RestAssured.baseURI = "http://api.zippopotam.us";
		RestAssured.port = 80;
	}
	@Test
	public void testNomeDaRuaRestAssured() {
		given()
			.log().all()
		.when()
			.get("/br/01000-000")
		.then()
			.statusCode(200)
			.body("places[0].'place name'", is("São Paulo"))
			;
	}

}

