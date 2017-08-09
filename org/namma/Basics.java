package org.namma;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basics {
	public static AndroidDriver<AndroidElement>Capabilities() throws MalformedURLException {
		File homedir= new File(System.getProperty("user.home"));
		File appdir= new File(homedir,"/Downloads");
		File app=new File(appdir,"nk3.apk");
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "420007e9d81a44cf");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.newskick.nammakaravali");
		capabilities.setCapability("appActivity","com.newskick.nammakaravali.Activity.SplashActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		return driver;
	}

}
