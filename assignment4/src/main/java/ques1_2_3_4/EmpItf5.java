package ques1_2_3_4;

public class EmpItf5 implements Employeee, Runnable{

	public int id1() {
		// TODO Auto-generated method stub
		return 5555;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Shruti";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 24;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 3752;
	}

	public int experience1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean goodFeedback1() {
		// TODO Auto-generated method stub
		return false;
	}

	public String fathersName1() {
		// TODO Auto-generated method stub
		return "UYT";
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp5");
		
	}

}
