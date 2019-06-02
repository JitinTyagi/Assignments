package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSlider 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement x= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		WebElement sliderstri = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		int w = sliderstri.getSize().getWidth();
		Thread.sleep(5000);
		act.dragAndDropBy(x, w/2, 0).perform();
		
		Thread.sleep(3000);
		act.dragAndDropBy(x, -(w/4), 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(x, -(w/4), 0).perform();
		Thread.sleep(3000);
		driver.close();
	}
}
