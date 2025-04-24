import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize(); //browser
		
		driver.switchTo().frame("a077aa5e"); //user will move inside into the frame
		
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		driver.switchTo().defaultContent(); //come out from the frame
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc@gmail.com");

	}

}
