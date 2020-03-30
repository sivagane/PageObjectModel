package org.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassGreens {
static WebDriver d;

public static void launch(String s) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\PageObjectModel\\div\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
}
public static void klik(WebElement w) {
	w.click();
}
public static void ScrollDown(WebElement w) {
	JavascriptExecutor js=(JavascriptExecutor)d;
	js.executeScript("arguments[0].scrollIntoView(true)", w);
}
public static void gText(WebElement w) {
	String T = w.getText();
	System.out.println(T);
}
}
