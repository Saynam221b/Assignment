package ques1_2_3_4;

public class EmpItf4 implements Employeee, Runnable{

	public int id1() {
		// TODO Auto-generated method stub
		return 4444;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Saloni";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 24;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 3421;
	}

	public int experience1() {
		// TODO Auto-generated method stub
		return 1;
	}

	public boolean goodFeedback1() {
		// TODO Auto-generated method stub
		return true;
	}

	public String fathersName1() {
		// TODO Auto-generated method stub
		return "HFY";
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp4");
		
	}

	

}
