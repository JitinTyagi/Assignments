package assignments;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMt {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.makemytrip.com/");
		WebElement from = dri.findElement(By.xpath("//input[@id='fromCity']"));
		from.click();
		List<WebElement> source =  from.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		System.out.println(source.size());
		for(WebElement x:source)
		{
			System.out.println(x.getText());
		}
		Thread.sleep(3000);
		System.out.println("this is destination");
		
		WebElement dest = dri.findElement(By.xpath("//input[@id='toCity']"));
		dest.click();
		List<WebElement> destination = dest.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		System.out.println(destination.size());
		for(WebElement x:destination)
		{
			System.out.println(x.getText());
		}
		dri.close();
	}

}
