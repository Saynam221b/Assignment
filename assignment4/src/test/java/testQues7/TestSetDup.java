package testQues7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ques7.SetDup;

public class TestSetDup {
	
	@Test
	public void sol() {
	SetDup obj = new SetDup();
		
	int ans = obj.ans();
	 assertEquals(13, ans);
	}
}
