import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize(); //browser will maximized
		
		
		
		WebElement accountlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(accountlist).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();

	}

}
