package Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		// Abrindo Navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\Documents\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Navegando para a página do TaskIt
		navegador.get("http://www.juliodelima.com.br/taskit");

		// Clicar no link que possui o texto "Sign In"
		navegador.findElement(By.linkText("Sign in")).click();

		// Identificando o formulario de login
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

		// Digitar no campo com nome "Login" que está dentro do formulário de id "signinbox" o texto "raphasan"
		formularioSignInBox.findElement(By.name("login")).sendKeys("raphasan");

		// Digitar no campo com nome "password" que está dentro do formulário de id "signinbox" o texto "081921"
		formularioSignInBox.findElement(By.name("password")).sendKeys("081921");

		// Clicar no link com o texto "SIGN IN"
		navegador.findElement(By.linkText("SIGN IN")).click();
		
		// Validar que dentro do elemento com class "me" está o texto "Hi, Raphael Santos"
		WebElement me = navegador.findElement(By.className("me"));
		String textoElementoMe = me.getText();
		assertEquals("Hi, Raphael Santos", textoElementoMe);
		
		
		// Fechar o Navegador
		//navegador.quit();
			
		

	}
}
