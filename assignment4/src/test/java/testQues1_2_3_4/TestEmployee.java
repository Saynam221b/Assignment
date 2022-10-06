package testQues1_2_3_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ques1_2_3_4.Emp1;
import ques1_2_3_4.Emp10;
import ques1_2_3_4.Emp2;
import ques1_2_3_4.Emp3;
import ques1_2_3_4.Emp4;
import ques1_2_3_4.Emp5;
import ques1_2_3_4.Emp6;
import ques1_2_3_4.Emp7;
import ques1_2_3_4.Emp8;
import ques1_2_3_4.Emp9;

public class TestEmployee {
	@Test
    public void values() {

        // For Emp 1
        Emp1 e1 = new Emp1();
        int id = e1.id();
        assertEquals(1111, id);
        System.out.println("Id of emp1 is "+id);
        
        String name = e1.name();
        assertEquals("Saynam", name);
        System.out.println("Name of emp1 is "+name);
        
        int age = e1.age();
        assertEquals(23, age);
        System.out.println("AGe of emp1 is "+age);
        
        int salary = e1.salary();
        assertEquals(1000, salary);
        System.out.println("Salary of emp1 is "+salary +"rs");
        
        int exp =  e1.experience();
        assertEquals(1, exp);
        System.out.println("Experience of emp1 is "+exp);
        
        Boolean feedBack =  e1.goodFeedback();
        assertEquals(true, feedBack);
        System.out.println("Is emp1 feedback good?  "+feedBack);
        
        String fName = e1.fathersName();
        assertEquals("RK Sharma", fName);
        System.out.println("Father's name of emp1 is "+fName);
        
        String desg = e1.designation();
        assertEquals("Data Engineer", desg);
        System.out.println("Designation of emp1 is "+desg);
    
        System.out.println();
        System.out.println("Printing thread .... ");
        Thread t1 = new Thread(new Emp1());
        t1.start();
        
        
        // For Emp 2
        Emp2 e2 = new Emp2();
        System.out.println();
        int id2 = e2.id();
        assertEquals(2222, id2);
        System.out.println("Id of emp2 is "+id2);
        
        String name2 = e2.name();
        assertEquals("Arghya SenGupta", name2);
        System.out.println("Name of emp2 is "+name2);
        
        int age2 = e2.age();
        assertEquals(30, age2);
        System.out.println("Age of emp2 is "+age2);
        
        int salary2 = e2.salary();
        assertEquals(10000000, salary2);
        System.out.println("Salary of emp2 is "+salary2 +"rs");
        
        int exp2 =  e2.experience();
        assertEquals(10, exp2);
        System.out.println("Experience of emp2 is "+exp2);
        
        Boolean feedBack2 =  e2.goodFeedback();
        assertEquals(true, feedBack2);
        System.out.println("Is emp2 feedback good?  "+feedBack2);
        
        String fName2 = e2.fathersName();
        assertEquals("XYZ", fName2);
        System.out.println("Father's name of emp2 is "+fName2);
        
        String desg2 = e2.designation();
        assertEquals("Teacher", desg2);
        System.out.println("Designation of emp2 is "+desg2);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t2 = new Thread(new Emp2());
        t2.start();
      
        
        // For Emp 3
        Emp3 e3 = new Emp3();
        System.out.println();
        int id3 = e3.id();
        assertEquals(3333, id3);
        System.out.println("Id of emp3 is "+id3);
        
        String name3 = e3.name();
        assertEquals("Abhitayu", name3);
        System.out.println("Name of emp3 is "+name3);
        
        int age3 = e3.age();
        assertEquals(24, age3);
        System.out.println("AGe of emp3 is "+age3);
        
        int salary3 = e3.salary();
        assertEquals(13332, salary3);
        System.out.println("Salary of emp3 is "+salary3 +"rs");
        
        int exp3 =  e3.experience();
        assertEquals(0, exp3);
        System.out.println("Experience of emp3 is "+exp3);
        
        Boolean feedBack3 =  e3.goodFeedback();
        assertEquals(true, feedBack3);
        System.out.println("Is emp3 feedback good?  "+feedBack3);
        
        String fName3 = e3.fathersName();
        assertEquals("ABC", fName3);
        System.out.println("Father's name of emp3 is "+fName3);
        
        String desg3 = e3.designation();
        assertEquals("Data Engineer", desg3);
        System.out.println("Designation of emp3 is "+desg3);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t3 = new Thread(new Emp3());
        t3.start();
        
        // For Emp 4
        Emp4 e4 = new Emp4();
        System.out.println();
        int id4 = e4.id();
        assertEquals(4444, id4);
        System.out.println("Id of emp4 is "+id4);
        
        String name4 = e4.name();
        assertEquals("Piyush", name4);
        System.out.println("Name of emp4 is "+name4);
        
        int age4 = e4.age();
        assertEquals(23, age4);
        System.out.println("AGe of emp4 is "+age4);
        
        int salary4 = e4.salary();
        assertEquals(12320, salary4);
        System.out.println("Salary of emp4 is "+salary4 +"rs");
        
        int exp4 =  e4.experience();
        assertEquals(0, exp4);
        System.out.println("Experience of emp4 is "+exp4);
        
        Boolean feedBack4 =  e4.goodFeedback();
        assertEquals(false, feedBack4);
        System.out.println("Is emp4 feedback good?  "+feedBack4);
        
        String fName4 = e4.fathersName();
        assertEquals("XYA", fName4);
        System.out.println("Father's name of emp4 is "+fName4);
        
        String desg4 = e4.designation();
        assertEquals("Data Engineer", desg4);
        System.out.println("Designation of emp4 is "+desg4);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t4 = new Thread(new Emp4());
        t4.start();
        
        
        // For Emp 5
        Emp5 e5 = new Emp5();
        System.out.println();
        int id5 = e5.id();
        assertEquals(5555, id5);
        System.out.println("Id of emp5 is "+id5);
        
        String name5 = e5.name();
        assertEquals("Shivam", name5);
        System.out.println("Name of emp5 is "+name5);
        
        int age5 = e5.age();
        assertEquals(23, age5);
        System.out.println("AGe of emp5 is "+age5);
        
        int salary5 = e5.salary();
        assertEquals(12733, salary5);
        System.out.println("Salary of emp5 is "+salary5 +"rs");
        
        int exp5 =  e5.experience();
        assertEquals(1, exp5);
        System.out.println("Experience of emp5 is "+exp5);
        
        Boolean feedBack5 =  e5.goodFeedback();
        assertEquals(true, feedBack5);
        System.out.println("Is emp5 feedback good?  "+feedBack5);
        
        String fName5 = e5.fathersName();
        assertEquals("KNC", fName5);
        System.out.println("Father's name of emp5 is "+fName5);
        
        String desg5 = e5.designation();
        assertEquals("Data Engineer", desg5);
        System.out.println("Designation of emp5 is "+desg5);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t5 = new Thread(new Emp5());
        t5.start();
        
        
        // For Emp 6
        Emp6 e6 = new Emp6();
        System.out.println();
        int id6 = e6.id();
        assertEquals(6666, id6);
        System.out.println("Id of emp6 is "+id6);
        
        String name6 = e6.name();
        assertEquals("Shubam", name6);
        System.out.println("Name of emp6 is "+name6);
        
        int age6 = e6.age();
        assertEquals(23, age6);
        System.out.println("AGe of emp6 is "+age6);
        
        int salary6 = e6.salary();
        assertEquals(3532, salary6);
        System.out.println("Salary of emp6 is "+salary6 +"rs");
        
        int exp6 =  e6.experience();
        assertEquals(1, exp6);
        System.out.println("Experience of emp6 is "+exp6);
        
        Boolean feedBack6 =  e6.goodFeedback();
        assertEquals(true, feedBack6);
        System.out.println("Is emp6 feedback good?  "+feedBack6);
        
        String fName6 = e6.fathersName();
        assertEquals("SDG", fName6);
        System.out.println("Father's name of emp6 is "+fName6);
        
        String desg6 = e6.designation();
        assertEquals("Data Engineer", desg6);
        System.out.println("Designation of emp6 is "+desg6);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t6 = new Thread(new Emp6());
        t6.start();
        
        
        // For Emp 7
        Emp7 e7 = new Emp7();
        System.out.println();
        int id7 = e7.id();
        assertEquals(7777, id7);
        System.out.println("Id of emp7 is "+id7);
        
        String name7 = e7.name();
        assertEquals("Sumedh", name7);
        System.out.println("Name of emp7 is "+name7);
        
        int age7 = e7.age();
        assertEquals(26, age7);
        System.out.println("AGe of emp7 is "+age7);
        
        int salary7 = e7.salary();
        assertEquals(1324231, salary7);
        System.out.println("Salary of emp7 is "+salary7 +"rs");
        
        int exp7 =  e7.experience();
        assertEquals(10, exp7);
        System.out.println("Experience of emp7 is "+exp7);
        
        Boolean feedBack7 =  e7.goodFeedback();
        assertEquals(true, feedBack7);
        System.out.println("Is emp7 feedback good?  "+feedBack7);
        
        String fName7 = e7.fathersName();
        assertEquals("IGU", fName7);
        System.out.println("Father's name of emp7 is "+fName7);
        
        String desg7 = e7.designation();
        assertEquals("Teacher", desg7);
        System.out.println("Designation of emp7 is "+desg7);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t7 = new Thread(new Emp7());
        t7.start();
        
        
        // For Emp 8
        Emp8 e8 = new Emp8();
        System.out.println();
        int id8 = e8.id();
        assertEquals(8888, id8);
        System.out.println("Id of emp8 is "+id8);
        
        String name8 = e8.name();
        assertEquals("Aman", name8);
        System.out.println("Name of emp8 is "+name8);
        
        int age8 = e8.age();
        assertEquals(24, age8);
        System.out.println("AGe of emp8 is "+age8);
        
        int salary8 = e8.salary();
        assertEquals(129372, salary8);
        System.out.println("Salary of emp8 is "+salary8 +"rs");
        
        int exp8 =  e8.experience();
        assertEquals(0, exp8);
        System.out.println("Experience of emp8 is "+exp8);
        
        Boolean feedBack8 =  e8.goodFeedback();
        assertEquals(true, feedBack8);
        System.out.println("Is emp8 feedback good?  "+feedBack8);
        
        String fName8 = e8.fathersName();
        assertEquals("KIK", fName8);
        System.out.println("Father's name of emp8 is "+fName8);
        
        String desg8 = e8.designation();
        assertEquals("Data Engineer", desg8);
        System.out.println("Designation of emp8 is "+desg8);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t8 = new Thread(new Emp8());
        t8.start();
        
        
        // For Emp 9
        Emp9 e9 = new Emp9();
        System.out.println();
        int id9 = e9.id();
        assertEquals(9999, id9);
        System.out.println("Id of emp9 is "+id9);
        
        String name9 = e9.name();
        assertEquals("Shivani", name9);
        System.out.println("Name of emp9 is "+name9);
        
        int age9 = e9.age();
        assertEquals(24, age9);
        System.out.println("AGe of emp9 is "+age9);
        
        int salary9 = e9.salary();
        assertEquals(14123, salary9);
        System.out.println("Salary of emp9 is "+salary9 +"rs");
        
        int exp9 =  e9.experience();
        assertEquals(0, exp9);
        System.out.println("Experience of emp9 is "+exp9);
        
        Boolean feedBack9 =  e9.goodFeedback();
        assertEquals(true, feedBack);
        System.out.println("Is emp9 feedback good?  "+feedBack9);
        
        String fName9 = e9.fathersName();
        assertEquals("JJUG", fName9);
        System.out.println("Father's name of emp9 is "+fName9);
        
        String desg9 = e9.designation();
        assertEquals("Data Engineer", desg9);
        System.out.println("Designation of emp9 is "+desg9);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t9 = new Thread(new Emp9());
        t9.start();
        
        // For Emp 10
        Emp10 e10 = new Emp10();
        System.out.println();
        int id10 = e10.id();
        assertEquals(1010, id10);
        System.out.println("Id of emp10 is "+id10);
        
        String name10 = e10.name();
        assertEquals("Gaurav", name10);
        System.out.println("Name of emp10 is "+name10);
        
        int age10 = e10.age();
        assertEquals(24, age10);
        System.out.println("AGe of emp10 is "+age10);
        
        int salary10 = e10.salary();
        assertEquals(23450, salary10);
        System.out.println("Salary of emp10 is "+salary10 +"rs");
        
        int exp10 =  e10.experience();
        assertEquals(1, exp10);
        System.out.println("Experience of emp10 is "+exp10);
        
        Boolean feedBack10 =  e10.goodFeedback();
        assertEquals(true, feedBack10);
        System.out.println("Is emp10 feedback good?  "+feedBack10);
        
        String fName10 = e10.fathersName();
        assertEquals("KIH", fName10);
        System.out.println("Father's name of emp10 is "+fName10);
        
        String desg10 = e10.designation();
        assertEquals("Data Engineer", desg10);
        System.out.println("Designation of emp10 is "+desg10);
    
        System.out.println();
        System.out.println("Printing thread  ....");
        Thread t10 = new Thread(new Emp10());
        t10.start();
           
}
	
}
