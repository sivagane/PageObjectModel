package org.test;

public class ExecuatbleClass1 extends BaseClass1 {

	public static void main(String[] args) {
		launch1("http://www.greenstechnologys.com/");
		loginpage1 l=new loginpage1();
		
		klik(l.getCert());
		scrolldown(l.getScroll());
		klik(l.getCour());
		scrolldown(l.getScroll1());
		gtext(l.getText());
		}
}
