package com.kpi.question1;

/**
 * @author SaynamSharma
 *
 */
public class RiceAndDaal extends Food {

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	int protiens() {
		// TODO Auto-generated method stub
		return 30;
	}

	static int price(int price) {
		return price;
	}

	static int protien(int protien) {
		return protien;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new RiceAndDaal();
		System.out.println(f.price());
		System.out.println(f.protiens());

	}

}
