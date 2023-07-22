package com.obsqura.Automation;

public class BrowserCommands extends Base
{
 public void browserCommands()
 {
	 String title=driver.getTitle();
	 String url=driver.getCurrentUrl();
	 String pagesource=driver.getPageSource();			 
 }
 public static void main(String args[])
 {
	 BrowserCommands browsercommands=new BrowserCommands();
	 browsercommands.intializeBrowser();
	 browsercommands.browserCommands();
	 browsercommands.driverCloseOrQuit();
 }
}
