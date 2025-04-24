import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize(); //browser will maximized
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.quit(); //close the browser

	}

}
