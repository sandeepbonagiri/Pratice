package webtables;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		  WebElement table = driver.findElement(By.id("table1"));
webutility web = new webutility();
web.getTableData(table);

System.out.println(web);
		  /**
		   *  Call this method to get Table Cell Data by passing WebElement table
		   *  @Params table
		   *  
		   *  @author Fayaz
		   **/
		  
}
}