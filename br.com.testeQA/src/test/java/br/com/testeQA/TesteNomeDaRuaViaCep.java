package br.com.testeQA;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;

public class TesteNomeDaRuaViaCep {
	@Before
	public void setUp() {
	RestAssured.baseURI = "http://viacep.com.br/ws";
	
		}
	@Test
	public void testNomeDaRuaAssert() {
		String rua = 
				given()
			.log().all()
		.when()
			.get("/04455130/json/")
		.then()
			.statusCode(200)
			.extract().path("logradouro")
			;
		Assert.assertEquals("Rua João Scatamacchia", rua);
		System.out.println(rua);
	}
}