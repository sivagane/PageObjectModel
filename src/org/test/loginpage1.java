package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 extends BaseClass1 {
public loginpage1() {
	PageFactory.initElements(d,this);
}
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement Cert;
	
	@FindBy(xpath="//h1[text()='PEGA']")
	private WebElement Scroll;
	
	@FindBy(xpath="(//a[@href='selenium-course-content.html'])[2]")
    private WebElement Cour;
	
	@FindBy(xpath="(//h2[@class='red_text'])[6]")
	private WebElement Scroll1;
	
	@FindBy(xpath="//p[contains(text(),'HI, I have taken Selenium training in chennai at Greens technology.')]")
	private WebElement Text;

	public WebElement getCert() {
		return Cert;
	}

	public WebElement getScroll() {
		return Scroll;
	}

	public WebElement getCour() {
		return Cour;
	}

	public WebElement getScroll1() {
		return Scroll1;
	}

	public WebElement getText() {
		return Text;
	}
	
	
}
