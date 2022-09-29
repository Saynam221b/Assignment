package com.kpi.question1;
@FunctionalInterface
public interface FnInterface {
	
	public void sum(int a, int b);
	
	 default void a() {
		 System.out.println("Printing....");
	 }

}
