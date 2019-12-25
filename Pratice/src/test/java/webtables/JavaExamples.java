package webtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        //String[] stringArray = {"Structure", "Country", "City", "Height", "Build", "Rank"};
		        //List<String> stringList = new ArrayList(Arrays.asList(stringArray));

		        //for (String listItem : stringList) {
		            //System.out.println(listItem);
		        //}
		
        List<String> namesList = Arrays.asList("Structure", "Country", "City", "Height", "Built", "Rank", "…", "Total"," Burj", "Khalifa", "Clock Tower Hotel", "Taipei 101", "Financial Center");
        System.out.println(namesList);
        System.out.println(namesList);
        System.out.println(namesList);


		
		            WebDriverManager.chromedriver().setup();
		    		WebDriver driver = new ChromeDriver();
		    		driver.manage().window().maximize();
		    		driver.get("https://www.toolsqa.com/automation-practice-table/");

		          WebElement table = driver.findElement(By.xpath("//*[@id='content']/table"));
		            
		          // for(int i=0;i<table.size();i++) 
		           
		         
		          // {
			    //        System.out.println(table.get(i).getText());
			            
			        // String stringtable=  table.get(i).getText());
		           //}
		          
		           List<String> columnNames = table.findElements(By.tagName("th"))   // get table headers
                           .stream()
                           .map(WebElement::getText)        // get the text
                           .map(String::trim)               // trim - no space
                           .collect(Collectors.toList());   // collect to a list

		           System.out.println(columnNames);
		           
		           System.out.println(
		                   "If any number from aList is present in List 2 :" +
		                	namesList.stream().allMatch(num -> columnNames.contains(num)));
	
		        }
		    }
		

	
	

