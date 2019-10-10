package Package_GitHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WD_Ex {
public static void main(String[] args) {
	//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.manage().window().maximize();	
		
		Select a = new Select(driver.findElement(By.name("birthday_year")));
		
		List<WebElement> options = a.getOptions();
		
		for(WebElement option: options) {
			System.out.println(option.getText());
		}
}
}
