package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base{

	public void xPathLocator()
	{

		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement entervalue =driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement entervalue2=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	}
		public void XpathLocatorBasic()
		{
	    driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	    WebElement select=driver.findElement(By.xpath("//select[starts-with(@id,'single-input-field')]"));
	    driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	    WebElement showmsgusingcontains=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	    WebElement showmsgtext=driver.findElement(By.xpath("//button[text()='Show Message']"));
	    WebElement showmsgor=driver.findElement(By.xpath("//button[text()='Show Message'or@id='button-one']"));
	    WebElement showmsgand=driver.findElement(By.xpath("//button[text()='Show Message'and@id='button-one']"));
		}
	    
	    public void xpathlocatorAxesMethods()
	    {
	    WebElement showmsgparent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	    WebElement showmsgchild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
	    WebElement showmsgfolow=driver.findElement(By.xpath("//button[@id=\"button-one\"]//following::div[@id=\"message-one\""));
	    WebElement showmsgprec=driver.findElement(By.xpath("//button[@id=\"button-one\"]//preceding::div[@class=\"card\"]"));
	    WebElement showmsgances=driver.findElement(By.xpath("//button[@id=\"button-one\"]//ancestor::div[@class=\"card\"]"));
	    WebElement showmsgdesc=driver.findElement(By.xpath("//div[@class=\"card\"]//descendant::label[@for=\"inputEmail4\"]"));
	    WebElement showmsgfs=driver.findElement(By.xpath("//label[@for=\"inputEmail4\"]//following-sibiling::input"));
	    WebElement showmsgindex=driver.findElement(By.xpath("//div[(@class=\"card-header\"])[2]"));
	    }
	
	public static void main(String[] args) 
	{
		XpathLocator xpathlocator=new XpathLocator();
		xpathlocator.intializeBrowser();
		xpathlocator.xPathLocator();
		xpathlocator.XpathLocatorBasic();
		xpathlocator.xpathlocatorAxesMethods();
		xpathlocator.driverCloseOrQuit();

	}

}