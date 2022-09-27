package com.kpi.question1;

/**
 * @author SaynamSharma
 *
 */
public class Dog extends Animals {

	@Override
	int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "Dog is of black color";
	}

	@Override
	void name() {
		System.out.println("I am a Dog");
		
	}
	int weight;


	public int getWeight() {
		return 20;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
