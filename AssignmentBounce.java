package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentBounce 
{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		int x = 0;
		int y = 0;
		dri.manage().window().setSize(new Dimension(200,200));
		for (int i= 1; i<=10; i++)
		{
			x = x+100;
			y = y+150;
		Point p = new Point(x,y);
		dri.manage().window().setPosition(p);
		Thread.sleep(2000);
		}
		dri.close();
	}
	

}
