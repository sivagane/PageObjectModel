package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageGreens extends BaseClassGreens {
public LoginpageGreens() {
	PageFactory.initElements(d,this);
}
@FindBy(xpath="//a[@href='contact.php']")
private WebElement Contact;

@FindBy(className="title divider-3")
private WebElement Branches;

@FindBy(xpath="//div[@class='bottom-social-icons pull-right']")
private WebElement SocialNetworkBtn;

@FindBy(xpath="//div[@class='col-md-6 col-sm-6 left-side']")
private WebElement CopyRight;

public WebElement getContact() {
	return Contact;
}

public WebElement getBranches() {
	return Branches;
}

public WebElement getSocialNetworkBtn() {
	return SocialNetworkBtn;
}

public WebElement getCopyRight() {
	return CopyRight;
}

}
