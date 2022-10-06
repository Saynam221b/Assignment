package ques1_2_3_4;

public class Emp4 extends Employee implements Runnable{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 4444;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Piyush";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 12320;
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean goodFeedback() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String fathersName() {
		// TODO Auto-generated method stub
		return "XYA";
	}

	@Override
	public String designation() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}
	public void run() {
	    System.out.println("This is thread for Employee 4");
			
		}
}
