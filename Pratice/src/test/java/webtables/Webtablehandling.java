package webtables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablehandling {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));
	    List<WebElement> column = table.findElements(By.tagName("td"));
	    List<String> value = new ArrayList<String>();
		
	    System.out.println(rows.size());

        for (int j=0; j<column.size(); j++){
            System.out.println(column.get(j).getText());
            value.add(column.get(j).getText());
        }
        if (value.contains("Name")){
            System.out.println("Value found");
        }
        else{
            System.out.println("Not Found");
        }
}	
}		
		
		
	


