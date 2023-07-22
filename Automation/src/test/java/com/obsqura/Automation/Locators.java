package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locator()
	{
		WebElement showMessage= driver.findElement(By.id("button-one"));
		WebElement clearFix= driver.findElement(By.className("clearfix"));
		WebElement cssUsingIdandTag=driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssUsingClassandTag=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement cssUsingTagandAttribute= driver.findElement(By.cssSelector("section[class=clearfix]"));
		WebElement linkText = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partialLinktext=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement button= driver.findElement(By.id("button-one"));


	}

	public void  idExample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement showMessage1= driver.findElement(By.id("button-one"));
		WebElement getTotal= driver.findElement(By.id("button-two"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement getFirstSelected= driver.findElement(By.id("button-first"));
		WebElement getAllSelected= driver.findElement(By.id("button-all"));
		WebElement selectcolour= driver.findElement(By.id("message-one"));
	}

	public void classExample()
	{
		driver.navigate().back();
		WebElement topLogo= driver.findElement(By.className("top-logo"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement copyright= driver.findElement(By.className("copyright"));
		WebElement forGroup= driver.findElement(By.className("form-group"));
		WebElement formCheckLabel= driver.findElement(By.className("form-check-label"));
	}

	public void linkExample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement linkText = driver.findElement(By.linkText("Home"));
	}


	public void cssSelectorExample()
	{
		driver.navigate().back();
		WebElement cssUsingIdandTag1=driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement cssUsingIdandTag2=driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssUsingIdandTag3=driver.findElement(By.cssSelector("div#collapsibleNavbar"));

		WebElement cssUsingClassandTag1=driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssUsingClassandTag2=driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement cssUsingClassandTag3=driver.findElement(By.cssSelector("section.clearfix"));

		driver.navigate().to("https://www.amazon.com/");
		WebElement cssUsingTagandAttribute1= driver.findElement(By.cssSelector("select[aria-describedby=searchDropdownDescription]"));
		WebElement cssUsingTagandAttribute2= driver.findElement(By.cssSelector("option[selected=selected]"));
		WebElement cssUsingTagandAttribute3= driver.findElement(By.cssSelector("a[id=skippedLink]"));

		WebElement cssUsingTagClassandAttribute1= driver.findElement(By.cssSelector("a.skip-link[id=skiplink]"));
		WebElement cssUsingTagClassandAttribute2= driver.findElement(By.cssSelector("input.nav-progressive-attribute[name=dropdown-selection]"));

	}

	public static void main(String[] args) 
	{

		Locators locators = new Locators();
		locators.intializeBrowser();
		locators.locator();
		locators.idExample();
		locators.classExample();
		locators.cssSelectorExample();
		locators.driverCloseOrQuit();
	}

}