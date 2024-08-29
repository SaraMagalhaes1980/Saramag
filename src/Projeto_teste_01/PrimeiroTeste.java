package Projeto_teste_01;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {

	@Test
	public void test() {
		//Abrindo o navegador e instanciando o ChromeDriver
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Hugo");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Carvalho");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Qd 01 Loja 10 - Brasilia/DF, CEP 70000-000");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("hugo.carvalho@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("(61) 99981-0001");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		
		//driver.quit();
				
		
		
		
		
		
		
	}
}	
		
		