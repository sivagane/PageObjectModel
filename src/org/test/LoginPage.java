package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(d,this);
}

@FindBy(id="email")
private WebElement User;

@FindBy(id="pass")
private WebElement Pass;

@FindBy(id="loginbutton")
private WebElement Klik;

public WebElement getUser() {
	return User;
}

public WebElement getPass() {
	return Pass;
}

public WebElement getKlik() {
	return Klik;
}






}
