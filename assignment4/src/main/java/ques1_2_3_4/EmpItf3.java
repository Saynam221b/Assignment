package ques1_2_3_4;

public class EmpItf3 implements Employeee, Runnable{

	public int id1() {
		// TODO Auto-generated method stub
		return 3333;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Asif";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 24;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 46765;
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
		return null;
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp3");
	}

}
