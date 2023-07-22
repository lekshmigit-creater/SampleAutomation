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
  {
      driver.navigate().to("https://www.selenium.dev/"); 
	  String input="Português (Brasileiro)";
	  List<WebElement> englishList=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
	  for(WebElement english:englishList)
      {
     String englishText=english.getText();
     if(englishText.equals(input))
    {
     english.click();
     break;
    }
      }
  }
}
