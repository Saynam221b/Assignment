package com.kpi.question2;

public class Driver extends ChildCls2{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCls2 cs = new Driver();
		AbsClass  cs1 = new ChildClass();
		
		//for first child
		System.out.println("Printing details of hen");
		System.out.println("name = "+cs.name());
		System.out.println("legs = "+cs.AnimalLegs());
		//for second child
		System.out.println("Printing details of dog");
		System.out.println("name = "+cs1.name());
		System.out.println("legs = "+cs1.AnimalLegs());
		
	}
}
