package com.obsqura.TestNgFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base
{
     @Test
     public void menu(String input)
	{
    	 
        List <WebElement> menuList=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
        menuList.size();
        for(WebElement menu:menuList)
        {
       String menuText=menu.getText();
       if(menuText.equals(input))
      {
       menu.click();
       break;
     }
   }
  }
     @Test
  public void FindElementsDropdown()
  {driver.navigate().to("https://www.selenium.dev/");
	  String input="Português (Brasileiro)";
	  WebElement english=driver.findElement(By.xpath("(//a[contains(@class,'toggle')])[2]"));
	  english.click();
	  List<WebElement> englishList=driver.findElements(By.xpath("//div[@class='dropdown']//li"));
      
	  for(WebElement menu:englishList)
      {
     String englishText=menu.getText();
     if(englishText.equals(input))
    {
     menu.click();
     break;
    }
      }
  }
}
