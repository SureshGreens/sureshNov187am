package org.company;

public class CompanyInfo {
//companyName(),companyId(),companyAddress()
	private void companyName() {
		System.out.println("Company name is CTS");
	}
	private void companyId() {
		System.out.println("Company Id is 123");
	}
	private void companyAddress() {
		System.out.println("Company Address is CRC");
	}

public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
