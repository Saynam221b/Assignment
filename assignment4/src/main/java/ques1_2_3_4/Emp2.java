package ques1_2_3_4;

public class Emp2 extends Employee implements Runnable{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 2222;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Arghya SenGupta";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 10000000;
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean goodFeedback() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String fathersName() {
		// TODO Auto-generated method stub
		return "XYZ";
	}

	@Override
	public String designation() {
		// TODO Auto-generated method stub
		return "Teacher";
	}
	public void run() {
	    System.out.println("This is thread for Employee 2");
			
		}

}
