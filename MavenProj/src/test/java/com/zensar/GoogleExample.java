package com.zensar;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GoogleExample {

	WebDriver W;
	
public void screenshot() throws IOException
{
		File f=((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("D:/ThirdRow/abc.png"));
		
		
}	

}
