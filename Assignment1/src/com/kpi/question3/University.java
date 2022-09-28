package com.kpi.question3;

public class University {
	
		
		int classNo;
		int marks;

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}
		//constructor1
		public University() {
			
		}
		//constructor2
		public University(int rank)
		{
			this.rank=rank;
		}
		//constructor3
		public University(int classNo,int marks)
		{
			this.classNo=classNo;
			this.marks=marks;
		}

	void disp()
	{
		System.out.println("Class Number is "+ classNo +"th");
		System.out.println("Marks are "+ marks + "%");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		University obj1 = new University(4,72); //obj1
		University obj2 = new University(10,51); //obj2
		University obj3 = new University(9,83); //obj3
		University obj4 = new University(11,95); //obj4
		University obj5  = new University(8,100); //obj5
	   
		obj1.disp();
		obj2.disp();
		obj3.disp();
		obj4.disp();
		obj5.disp();
		
	}

	}


