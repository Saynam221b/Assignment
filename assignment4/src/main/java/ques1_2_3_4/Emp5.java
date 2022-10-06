package ques1_2_3_4;

public class Emp5 extends Employee implements Runnable{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 5555;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Shivam";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 12733;
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean goodFeedback() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String fathersName() {
		// TODO Auto-generated method stub
		return "KNC";
	}

	@Override
	public String designation() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}
	public void run() {
	    System.out.println("This is thread for Employee 5");
			
		}

}
