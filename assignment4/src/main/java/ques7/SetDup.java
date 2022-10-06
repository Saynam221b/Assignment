package ques7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDup {
	
	
	
	public int ans( ) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(20);
		s.add(13);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		
		// by using iterator 
		int ele = 0;
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {	
			ele = it.next();
		}
		System.out.println("last element by iterator is "+ ele);
		
		
		// by converting set to list and finding index
		List<Integer> stringsList = new ArrayList<>(s);	
		int sol = stringsList.size()-1;
		System.out.println("last element by converting to list is "+stringsList.get(sol));
		
		return ele;
		
		
		
	}
		
		
	}
	
