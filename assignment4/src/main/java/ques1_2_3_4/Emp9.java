package ques1_2_3_4;

public class Emp9 extends Employee implements Runnable{

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 9999;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Shivani";
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 14123;
	}

	@Override
	public int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean goodFeedback() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String fathersName() {
		// TODO Auto-generated method stub
		return "JJUG";
	}

	@Override
	public String designation() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}
	public void run() {
	    System.out.println("This is thread for Employee 9");
			
		}

}