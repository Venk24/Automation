import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize(); //browser
		
	WebElement dblclickbutton =	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

	Actions act = new Actions(driver);
	
	act.doubleClick(dblclickbutton).perform(); //alert will open
	
	//switchto()
	
	Alert alrt = driver.switchTo().alert(); //control will go to alert
	
	System.out.println(alrt.getText());
	
	alrt.accept(); //it will click on ok button
	
	//alrt.dismiss(); //that is use for cancel button
	
	

	}

}
