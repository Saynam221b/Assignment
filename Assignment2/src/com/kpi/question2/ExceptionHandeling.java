package com.kpi.question2;

/**
 * @author SaynamSharma
 *
 */
public class ExceptionHandeling {

		 
	public static void main(String args[]) {
		int a = 5;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
			finally {
				System.out.println("Compilled successfully and exception is displayed");
		}
	}
}
	