package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
	    WebElement name = driver.findElement(By.xpath("//input[@type='text'][@name='name']"));
		name.sendKeys("Jitin");
		WebElement ph = driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[2]/input)[2]"));
		ph.sendKeys("1234554321");
		WebElement ema = driver.findElement(By.xpath("//input[contains(@name,'mail')]"));
		ema.sendKeys("abc@tempmail.net");
		WebElement nation = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[4]/select"));
		List<WebElement> nationlist = driver.findElements(By.tagName("option"));
		System.out.println(nationlist.size());
		for (WebElement x:nationlist)
		{
			System.out.println(x.getText());
		}
		nation.sendKeys("Canada");
		WebElement cit = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[5]/input"));
		cit.sendKeys("Muzaffarnagar");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("dante");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("way2auto");
		driver.findElement(By.xpath("(//*[@id='load_form']/div/div[2]/input)[2]")).click();
		Thread.sleep(3000);
		driver.close();
	}	
}
