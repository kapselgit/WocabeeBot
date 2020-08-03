package me.kapsel;

import java.util.ArrayList;

import javax.swing.JDialog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot {

	public static void main(String[] args, String username, String password) throws InterruptedException {
		// logowanie
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wocabee.app/app");
		Thread.sleep(100);
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).submit();
		Thread.sleep(1200);
		driver.get("https://wocabee.app/app/student/class/package_local/?class_id=19901&package_id=70646&mode=practice");
		Thread.sleep(4000);
		
		// porównywanie i wype³nianie
		
		//zmiana poziomu trudnosci
		WebElement levelToggler = driver.findElement(By.id("levelToggle"));
		WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].parentNode;", levelToggler);
		parent.click();
		//okienko zatrzymuj¹ce
		Thread.sleep(260);
		ArrayList<String> po_polsku = BiedaBazaDanych.main("pl", args);
		ArrayList<String> po_angielsku = BiedaBazaDanych.main("en", args);
		System.out.println(po_polsku);
		
		for(;;) {
		CharSequence answer = null;
		String word = driver.findElement(By.id("tfw_word")).getText();
		System.out.println(word);
		int i;
		for (i = 0; i < 10; i++) {
			if (word.equals(po_polsku.get(i))) {
				answer = po_angielsku.get(i);
				break;
			}
			if (word.equals(po_angielsku.get(i))) {
				answer = po_polsku.get(i);
				break;
			}
			System.out.println("Its " + i + "th pass");
		}
		
		driver.findElement(By.id("translateFallingWordAnswer")).click();
		System.out.println(answer);
		driver.findElement(By.id("translateFallingWordAnswer")).sendKeys(answer);
		Thread.sleep(100);
		driver.findElement(By.id("translateFallingWordSubmitBtn")).click();
		Thread.sleep(3000);
		}
	}

}
