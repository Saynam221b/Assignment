package com.kpi.question1;

/**
 * @author SaynamSharma
 *
 */
public class Lion extends Animals {

	@Override
	int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "lion is of Golden color";
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("I am a Lion");
		
	}

	int weight;

	public int getWeight() {
		return 30;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
