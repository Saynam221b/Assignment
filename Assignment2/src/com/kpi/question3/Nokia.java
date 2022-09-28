package com.kpi.question3;

public class Nokia extends Mobile {

	String color = "Black";

	void printDetails() {
		String brand = "apple"; // as is not coming as brand value because
		// Super keyword is taking brand value from parent class.
		System.out.println(super.brand);
		System.out.println(color);
	}

	public static void main(String args[]) {

		Nokia n = new Nokia();
		n.printDetails();
	}
}
