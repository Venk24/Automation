import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://www.google.com");
		
		
		
		driver.manage().window().maximize(); //browser will maximized
		
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("q")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).click();
		
//		driver.findElement(By.id("email")).sendKeys("abc@mailinator.com");
//		
//		driver.findElement(By.name("pass")).sendKeys("123455");
//		
//		driver.findElement(By.name("login")).click();
		
		
		
		
		
		Thread.sleep(3000);
		
		//driver.quit();

	}

}
