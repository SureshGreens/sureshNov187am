package org.lang;

public class StateDetails {
//southIndia(),northIndia()
	private void southIndia() {
		System.out.println("South India");
	}
	private void northIndia() {
		System.out.println("North India");
	}
public static void main(String[] args) {
	
	StateDetails s = new StateDetails();
	s.southIndia();
	s.northIndia();
	LanguageInfo l = new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
	}
}
