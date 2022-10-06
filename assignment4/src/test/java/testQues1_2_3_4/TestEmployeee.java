package testQues1_2_3_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ques1_2_3_4.EmpItf1;
import ques1_2_3_4.EmpItf2;

public class TestEmployeee {
	@Test
    public void values() {

        // For Emp 1
		EmpItf1 e1 = new EmpItf1();
        int id = e1.id1();
        assertEquals(1111, id);
        System.out.println("Id of emp1 is "+id);
        
        String name = e1.name1();
        assertEquals("Saynam", name);
        System.out.println("Name of emp1 is "+name);
        
        int age = e1.age1();
        assertEquals(23, age);
        System.out.println("AGe of emp1 is "+age);
        
        int salary = e1.salary1();
        assertEquals(1213, salary);
        System.out.println("Salary of emp1 is "+salary +"rs");
        
        int exp =  e1.experience1();
        assertEquals(0, exp);
        System.out.println("Experience of emp1 is "+exp);
        
        Boolean feedBack =  e1.goodFeedback1();
        assertEquals(true, feedBack);
        System.out.println("Is emp1 feedback good?  "+feedBack);
        
        String fName = e1.fathersName1();
        assertEquals("ABC", fName);
        System.out.println("Father's name of emp1 is "+fName);
        
        String desg = e1.designation1();
        assertEquals("Data Engineer", desg);
        System.out.println("Designation of emp1 is "+desg);
    
        System.out.println();
        System.out.println("Printing thread .... ");
        Thread t1 = new Thread(new EmpItf1());
        t1.start();
        

        // For Emp 2
		EmpItf2 e2 = new EmpItf2();
        int id1 = e2.id1();
        assertEquals(2222, id1);
        System.out.println("Id of emp2 is "+id1);
        
        String name2 = e2.name1();
        assertEquals("Bhaskar", name2);
        System.out.println("Name of emp2 is "+name2);
        
        int age2 = e2.age1();
        assertEquals(24, age2);
        System.out.println("AGe of emp2 is "+age2);
        
        int salary2 = e2.salary1();
        assertEquals(1234, salary2);
        System.out.println("Salary of emp2 is "+salary2 +"rs");
        
        int exp2 =  e2.experience1();
        assertEquals(0, exp2);
        System.out.println("Experience of emp2 is "+exp2);
        
        Boolean feedBack2 =  e2.goodFeedback1();
        assertEquals(true, feedBack2);
        System.out.println("Is emp1 feedback good?  "+feedBack2);
        
        String fName2 = e2.fathersName1();
        assertEquals("XYZ", fName2);
        System.out.println("Father's name of emp2 is "+fName2);
        
        String desg2 = e2.designation1();
        assertEquals("Data Engineer", desg2);
        System.out.println("Designation of emp2 is "+desg2);
    
        System.out.println();
        System.out.println("Printing thread .... ");
        Thread t2 = new Thread(new EmpItf2());
        t2.start();


}
}
