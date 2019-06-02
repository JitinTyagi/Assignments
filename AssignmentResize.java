package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentResize {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement cursor = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(cursor, 300, 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(cursor, 0, 300).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(cursor, -(300), -(300)).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
