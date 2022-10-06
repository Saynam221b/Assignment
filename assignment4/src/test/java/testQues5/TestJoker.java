package testQues5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ques5.Joker;

public class TestJoker {
@Test
public void ans() {
	
	
	Joker j = new Joker();
	
	String ans = j.dance("1", "Salsa");
	assertEquals("Joker1 is doing Salsa", ans);
	
	String ans2 = j.dance("2", "BharatNatyam");
	assertEquals("Joker2 is doing BharatNatyam", ans2);
	
	String ans3 = j.dance("3", "Hula");
	assertEquals("Joker3 is doing Hula", ans3);
	
	String ans4 = j.dance("4", "Kathak");
	assertEquals("Joker4 is doing Kathak", ans4);
	
	String ans5 = j.dance("5", "Kuchipudi");
	assertEquals("Joker5 is doing Kuchipudi", ans5);
	
	String ans6 = j.dance("6", "HipHop");
	assertEquals("Joker6 is doing HipHop", ans6);
	
	String ans7 = j.dance("7", "Break Dance");
	assertEquals("Joker7 is doing Break Dance", ans7);
	
	String ans8 = j.dance("8", "Couple dance");
	assertEquals("Joker8 is doing Couple dance", ans8);
	
	
}
}
