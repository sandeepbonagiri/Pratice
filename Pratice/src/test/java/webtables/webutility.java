package webtables;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class webutility {
	
	
	
	public static  void getTableData(WebElement table) {
		  List<WebElement> tableColHeaders = table.findElements(By.tagName("th"));
		  List<WebElement> tableRows = table.findElements(By.tagName("tr"));

		  // Start rowIndex with '1' because in the zeroth index we get 'th' tags   
		  for(int rowIndex = 1; rowIndex < tableRows.size(); rowIndex++) {
		     List<WebElement> tableCells = tableRows.get(rowIndex).findElements(By.tagName("td"));
		     for(int cellIndex = 0; cellIndex < tableCells.size(); cellIndex++) {
		         String tableCellData = tableCells.get(cellIndex).getText();
		         String tableColName  = tableColHeaders.get(cellIndex).getText();
		         
		  }
		 
				
		  }
	}
}
	
	


