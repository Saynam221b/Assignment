package testQues6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ques6.ArrayListAns;

public class TestArrayListAns {
@Test
public void ans() {
	
	
	ArrayListAns obj = new ArrayListAns();
	
	int s = obj.out();
	assertEquals(2, s);
}
}
