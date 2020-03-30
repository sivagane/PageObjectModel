package org.test;

public class ExecutableClassGreens extends BaseClassGreens {
public static void main(String[] args) {
	launch(" http://www.greenstechnologys.com/");
	LoginpageGreens l=new LoginpageGreens();
	
	klik(l.getContact());
	gText(l.getBranches());
	ScrollDown(l.getSocialNetworkBtn());
	gText(l.getCopyRight());
}
}
