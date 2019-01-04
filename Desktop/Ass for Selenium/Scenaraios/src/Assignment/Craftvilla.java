package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Craftvilla {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		
		//click sarees
		driver.findElement(By.linkText("SAREES")).click();
		Thread.sleep(2000);
		
		//filter 1000-2000
		driver.findElement(By.xpath("//label[@title='1000-2000']")).click();
		Thread.sleep(2000);
		
		//click on 3rd product
		driver.findElement(By.xpath("(//div[@class='col-xs-12 product'])")).click();
		Thread.sleep(2000);
	
         WebElement all = driver.findElement(By.className("pdp-offer-price"));
		System.out.println("the 3rd product name is="+all.getText());
		driver.close();

	}

}
