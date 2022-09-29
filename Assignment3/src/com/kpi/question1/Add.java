package com.kpi.question1;

public class Add implements FnInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add sum = new Add();
		sum.a();
		sum.sum(3, 4);
	}

	
	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}

}
