package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignMentFlipkart 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement Electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		System.out.println("Mobiles in the electronics menu are:");
		List<WebElement> Mob = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li/a")));
		for(int i = 1; i<Mob.size();  i++)
		{
			System.out.println(Mob.get(i).getText());
		}
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
