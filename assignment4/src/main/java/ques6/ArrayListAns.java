package ques6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListAns {
	 public int out () {
		 

	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Saynam");
	a1.add("Rohit");
	a1.add("Mashir");
	
	ArrayList<String> a2 = new ArrayList<String>();
	a2.add("Shivam");
	a2.add("Saynam");
	
	ArrayList<String> a3 = new ArrayList<String>();
	a3.add("Saynam");
	a3.add("Shivam");
	a3.add("Akash");
	
	ArrayList<String> a4 = new ArrayList<String>();
	a4.add("Rohit");
	a4.add("Gagan");
	a4.add("Saynam");
	a4.add("Ruder");
		 
	ArrayList<String> a5 = new ArrayList<String>();
	a5.add("Akash");
	a5.add("Ruder");
	a5.add("Saynam");
	a5.add("Rohan");
	
	
	ArrayList<String> ans1 = new ArrayList<>();

    ArrayList<String> ans2 = new ArrayList<>();

    ArrayList<String> ans3 = new ArrayList<>();
    
    ArrayList<String> ans4 = new ArrayList<>();
    
    ArrayList<String> ans5 = new ArrayList<>();


    ans1 = (ArrayList<String>) a1.stream().filter(a5::contains).collect(Collectors.toList());
    ans2 = (ArrayList<String>) a2.stream().filter(ans1::contains).collect(Collectors.toList()); 
    ans3 = (ArrayList<String>) a3.stream().filter(ans1::contains).collect(Collectors.toList());
    ans4 = (ArrayList<String>) a4.stream().filter(ans1::contains).collect(Collectors.toList());
    ans5 = (ArrayList<String>) a5.stream().filter(ans1::contains).collect(Collectors.toList());
    
    System.out.println("The common element is "+ans5);
    
    String ans = ans5.get(0);
    if(a1.contains(ans)) {
    	
    	System.out.println("Index value of " +ans5+ "  in list 1 is "+a1.indexOf(ans));
    }
	if(a2.contains(ans)) {
	    	
	    System.out.println("Index value of " +ans5+ "  in list 2 is "+a2.indexOf(ans));
	    }
	if(a3.contains(ans)) {
		
		System.out.println("Index value of " +ans5+ "  in list 3 is "+a3.indexOf(ans));
	}
	if(a4.contains(ans)) {
		
		System.out.println("Index value of " +ans5+ "  in list 4 is "+a4.indexOf(ans));
	}
	if(a5.contains(ans)) {
		
		System.out.println("Index value of " +ans5+ "  in list 5 is "+a5.indexOf(ans));
	}
	int a = a5.indexOf(ans);
	return a;
	 
}
}