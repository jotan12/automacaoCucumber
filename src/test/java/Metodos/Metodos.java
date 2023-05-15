package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome,driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void click(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
