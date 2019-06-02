package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentRightClick {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		Actions act = new Actions(driver);
		act.moveToElement(img).perform();
		Thread.sleep(3000);
		act.contextClick().perform();
		WebElement proinf = driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
		Thread.sleep(3000);
		act.moveToElement(proinf).perform();
		Thread.sleep(3000);
		WebElement inst = driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]"));
		Thread.sleep(3000);
		act.moveToElement(inst).perform();
		Thread.sleep(3000);
		WebElement htsu = driver.findElement(By.xpath("//*[@id=\"dm2m3i1tdT\"]"));
		Thread.sleep(3000);
		htsu.click();
		Thread.sleep(3000);
		driver.close();
	}
}
