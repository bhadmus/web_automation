package com.hellofresh.challenge;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

	

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		String Shots = getRandomString(5) + ".png";
		String folder = "./ScreenShots/";
		TakesScreenshot capture = (TakesScreenshot) driver;
		File shotSaved = capture.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shotSaved, new File(folder + Shots));
	}

}


