package ques1_2_3_4;

public class EmpItf2 implements Employeee, Runnable{

	public int id1() {
		// TODO Auto-generated method stub
		return 2222;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Bhaskar";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 24;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 1234;
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
		return "XYZ";
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp2 interface");
		
	}



}
