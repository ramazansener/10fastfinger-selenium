package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
 
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://10fastfingers.com/typing-test/turkish");
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.className("modal-close")).click();
		driver.findElement(By.className("close-button")).click();
		driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input")).click();

		

		WebElement searchBox =driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
		searchBox.click();
		searchBox.sendKeys("kulaklýk");
		Thread.sleep(2000);
		WebElement searchIcon =driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i"));
		searchIcon.click();*/
		
		Thread.sleep(3000);
		
		
		
		WebElement inputField =driver.findElement(By.id("inputfield"));
		
		
		List<WebElement> wordList=driver.findElements(By.xpath("//*[@id=\"row1\"]/span"));
		
		
		
		for (int i=0;i<wordList.size();i++) {
			inputField.sendKeys(wordList.get(i).getText()+" ");
		}
				
	}
}
