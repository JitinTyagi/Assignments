package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,10);
		driver.get("https://www.google.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']"))).sendKeys("selenium");
		  List<WebElement> list= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'selenium')]")));
		  System.out.println(list.size());
		  for(WebElement x:list)
		  {
			  System.out.println(x.getText());
		  }
	}
	

}
