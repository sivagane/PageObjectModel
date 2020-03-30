package org.test;

public class ExecutableClass extends BaseClass {
public static void main(String[] args) {
	launch("https://www.facebook.com/");
	LoginPage l=new LoginPage();
	
	gtext(l.getUser(),"sivag918@gmail.com");
	gtext(l.getPass(),"08091990");
	klik(l.getKlik());
	kill();
}
}
