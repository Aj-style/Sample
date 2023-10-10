package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launching_URL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jadha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/launch-edge-browser-in-selenium");
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();		
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();	
		
		
	}

}
