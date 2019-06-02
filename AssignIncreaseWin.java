package assignments;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncreaseWin {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dri =  new ChromeDriver();


		int x=0;
		int y=0;
		for(int i=1; i<=7; i++)
		{
			
		x=x+200;
		y=y+100;
		Dimension d= new Dimension(x,y);
		dri.manage().window().setSize(d);
		Thread.sleep(500);
	}
		dri.close();
	}

}