package org.namma;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WelComescreens extends Basics {
	public static void main(String[] args) throws MalformedURLException,InterruptedException{
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//android.widget.TextView[@text='Skip']")));
	
		AndroidElement skip=driver.findElementByXPath("//android.widget.TextView[@text='Skip']");
		System.out.println(skip.getText());
		driver.findElementByXPath("//android.widget.TextView[@text='Skip']").click();
		
		driver.findElementById("com.newskick.nammakaravali:id/tv_signup_skip").click();
		
		driver.findElementById("com.newskick.nammakaravali:id/btn_en").click();
		
		driver.findElementById("com.newskick.nammakaravali:id/spinner_location").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Udupi']").click();
		
		driver.findElementById("com.newskick.nammakaravali:id/btn_submit").click();
		
		AndroidElement element=driver.findElementById("com.newskick.nammakaravali:id/toolbar_title_tab");
		System.out.println(element.getText());
		
		driver.findElementById("com.newskick.nammakaravali:id/rr_news_row").click();
		driver.findElementById("com.newskick.nammakaravali:id/btn_bookmark").click();
		System.out.println("Bookmarked successfully");
		
		driver.findElementById("com.newskick.nammakaravali:id/btn_menu").click();
		
		if(driver.findElementByXPath("//android.widget.TextView[@text='Bookmarks']").isDisplayed()==true)
		{
			driver.findElementByXPath("//android.widget.TextView[@text='Bookmarks']").click();	
		}
		
		/*AndroidElement news=driver.findElementById("com.newskick.nammakaravali:id/tv_news_headline");
		System.out.println(news.getText());
		
		System.out.println("Test Passed");*/
		
		
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Category']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='National News']").click();
		
		AndroidElement newstitle= driver.findElementById("com.newskick.nammakaravali:id/tv_title_category");
		System.out.println(newstitle.getText());
		System.out.println("Test Passed");
		
		List<AndroidElement> list=driver.findElementsById("com.newskick.nammakaravali:id/tv_news_headline");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(driver.findElementsById("com.newskick.nammakaravali:id/tv_news_headline").get(i).getText());
		}
		
		driver.navigate().back();
		
		
		
	}

}
