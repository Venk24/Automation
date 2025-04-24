import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();  //rtp  //open the browser
		
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize(); //browser will maximized
		
		WebElement selectdropdownOption = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(selectdropdownOption);
		
		List<WebElement> li = sel.getOptions();
		
		System.out.println(li.size());
		
		for(int i = li.size()-1 ;i>=0 ; i--)
		{
			li.get(i).click();
			System.out.println(li.get(i).getText());
		}

	}

}
