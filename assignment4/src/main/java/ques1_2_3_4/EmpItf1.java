package ques1_2_3_4;

public class EmpItf1 implements Employeee, Runnable {

	public int id1() {
		// TODO Auto-generated method stub
		return 1111;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Saynam";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 23;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 1213;
	}

	public int experience1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean goodFeedback1() {
		// TODO Auto-generated method stub
		return true;
	}

	public String fathersName1() {
		// TODO Auto-generated method stub
		return "ABC";
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp1 interface");
		
	}

	
}
