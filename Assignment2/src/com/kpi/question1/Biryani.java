package com.kpi.question1;

/**
 * @author SaynamSharma
 *
 */
public class Biryani extends Food {

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	int protiens() {
		// TODO Auto-generated method stub
		return 12;
	}

	static int price(int price) {
		return price;
	}

	static int protien(int protien) {
		return protien;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Biryani();
		System.out.println(f.price());
		System.out.println(f.protiens());

	}
}
