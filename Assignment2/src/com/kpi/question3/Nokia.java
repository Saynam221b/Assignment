package com.kpi.question3;

public class Nokia extends Mobile {

	String color = "Black";
	
	void printDetails() {
		int ram = 8;
		String brand = "apple"; // as is not coming as brand and ram value because
		// Super keyword is taking brand value from parent class.
		System.out.println(super.brand);
		System.out.println(super.ram);
		System.out.println(color);
	}

	public static void main(String args[]) {

		Nokia n = new Nokia();
		n.printDetails();
	}
}
