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
		int a = 0;
		int b = 0;
		dri.manage().window().setSize(new Dimension(150,200));
		dri.manage().window().setPosition(new Point(20,200));
		
		for (int i= 1; i<=15; i++)
		{
			x = x+50;
			y = y+30;
			
		dri.manage().window().setPosition(new Point(x,y));
		Thread.sleep(1000);
		a=x+20;
		b=-(b+10);
		dri.manage().window().setPosition(new Point(a,b));
		Thread.sleep(1000);
		}
		dri.close();
	}
	

}
