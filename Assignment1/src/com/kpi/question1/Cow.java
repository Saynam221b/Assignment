package com.kpi.question1;

/**
 * @author SaynamSharma
 *
 */
public class Cow  extends Animals{

	@Override
	int legs() {
		// TODO Auto-generated method stub
		
		return 4;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "Cow is of red color";
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("I am a Cow");
		
	}
	int weight;


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
