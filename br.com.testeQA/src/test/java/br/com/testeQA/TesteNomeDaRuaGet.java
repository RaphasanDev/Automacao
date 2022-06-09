package br.com.testeQA;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TesteNomeDaRuaGet {
	@Test
	public void testNomeDaRuaMetodoGet() {
		Response response = RestAssured.request(Method.GET, "https://api.zippopotam.us/BR/01000-000");
		JsonPath extractor = response.jsonPath();
		String rua = extractor.get("places[0].'place name'");
		
		System.out.println(rua);
		
	Assert.assertEquals(rua, "São Paulo");
	}
}
